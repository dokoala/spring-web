package com.spring.web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.web.model.BoardVO;
import com.spring.web.model.MemberVO;
import com.spring.web.service.BoardService;
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
        
        log.info("로그인 페이지 진입");
        
    }
	
	@PostMapping("/login")
    // => @RequestMapping(value="login", method=RequestMethod.GET)
    public void loginPOST() {
        
        log.info("로그인 페이지 진입");
        
    }
	
	
	@GetMapping("/regist")
    // => @RequestMapping(value="regist", method=RequestMethod.GET)
    public void memberReigstGET() {
        
        log.info("회원 가입 페이지 진입");
        
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
}
