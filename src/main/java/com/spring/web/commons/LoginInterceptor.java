package com.spring.web.commons;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.spring.web.model.LoginDTO;
import com.spring.web.model.MemberVO;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    private static final String LOGIN = "member/login";
    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        
    	HttpSession httpSession = request.getSession();
    	MemberVO id = (MemberVO) httpSession.getAttribute("login");
    	System.out.println(id);
    	System.out.println(httpSession.getId());

        return true;
    }
 
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub
    	HttpSession httpSession = request.getSession();
        ModelMap modelMap = modelAndView.getModelMap();
        Object memberVO =  modelMap.get("member");
        
        System.out.println(memberVO);
        if (memberVO != null) {
            logger.info("new login success");
            httpSession.setAttribute(LOGIN, memberVO);
            System.out.println("보드리스트로 왜 안가냐 ㅡㅡ");
            
            if (request.getParameter("useCookie") != null) {
                logger.info("remember me...");
                // 쿠키 생성
                Cookie loginCookie = new Cookie("loginCookie", httpSession.getId());
                loginCookie.setPath("/");
                loginCookie.setMaxAge(60*60*24*7);
                // 전송
                response.addCookie(loginCookie);
            }

            Object destination = httpSession.getAttribute("destination");
            response.sendRedirect(destination != null ? (String) destination : "board/list");
        }
    }
 
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
        super.afterCompletion(request, response, handler, ex);
    }
}
