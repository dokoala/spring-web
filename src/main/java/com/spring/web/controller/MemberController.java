package com.spring.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.model.MemberVO;
import com.spring.web.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	private static final Logger log = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")
    // => @RequestMapping(value="login", method=RequestMethod.GET)
    public void login() {
        
        log.info("login page");
        
    }
	
	@PostMapping("/login")
    // => @RequestMapping(value="login", method=RequestMethod.POST)
    public String loginPOST(MemberVO member, HttpSession session, RedirectAttributes rttr) {
		
		String returnURL ="";
        if ( session.getAttribute("login") != null ){
            // 기존에 login이란 세션 값이 존재한다면
            session.removeAttribute("login"); // 기존값을 제거해 준다.
        }
         
        // 로그인이 성공하면 UserVO 객체를 반환함.
        MemberVO memberVO = memberService.login(member);
         
        if ( memberVO != null ){ // 로그인 성공
            session.setAttribute("login", memberVO); // 세션에 login인이란 이름으로 UserVO 객체를 저장해 놈.
            returnURL ="redirect:/board/list"; // 로그인 성공시 게시글 목록페이지로 바로 이동하도록 하고
        }else { // 로그인에 실패한 경우
            returnURL ="redirect:/member/login"; // 로그인 폼으로 다시 가도록 함
        }
         
        return returnURL; // 위에서 설정한 returnURL 을 반환해서 이동시킴              
    }
	
	// 로그아웃 하는 부분
    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 전체를 날려버림
//      session.removeAttribute("login"); // 하나씩 하려면 이렇게 해도 됨.
        return "redirect:/board/list"; // 로그아웃 후 게시글 목록으로 이동하도록...함
    }
	
	@GetMapping("/regist")
    // => @RequestMapping(value="regist", method=RequestMethod.GET)
    public void memberReigstGET() {
        
        log.info("register page");
        
    }
	
	// 회원 등록 
    @PostMapping("/regist")
    // => @RequestMapping(value="regist", method=RequestMethod.POST)
    public String memberReigstPOST(MemberVO member, RedirectAttributes rttr) {

        log.info("MemberVO : " + member);
        memberService.registMember(member);
        
        rttr.addFlashAttribute("result", "regist success");
        
        return "redirect:/member/login";
    }
    
 // 아이디 체크
    @PostMapping("/idCheck")
    @ResponseBody
    public String idCheck(String memberId) throws Exception{
		
    	log.info("memberIdChk() 진입");
		
		int result = memberService.idCheck(memberId);
		
		log.info("결과값 = " + result + " 값 : " + memberId);
		
		if(result != 0) {
			
			return "fail";	// 중복 아이디가 존재
			
		} 
		else {
			
			return "success";	// 중복 아이디 x
			
		}
		
	}
    
    // 닉네임 체크
    @PostMapping("/nicknameCheck")
    @ResponseBody
    public String nicknameCheck(String nickname) throws Exception{
		
    	log.info("nicknameCheck() 진입");
		
		int result = memberService.nicknameCheck(nickname);
		
		log.info("결과값 = " + result + " 값 : " + nickname);
		
		if(result != 0) {
			
			return "fail";	// 중복 아이디가 존재
			
		} 
		else {
			
			return "success";	// 중복 아이디 x
			
		}
		
	}
}
