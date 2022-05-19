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
            // ������ login�̶� ���� ���� �����Ѵٸ�
            session.removeAttribute("login"); // �������� ������ �ش�.
        }
         
        // �α����� �����ϸ� UserVO ��ü�� ��ȯ��.
        MemberVO memberVO = memberService.login(member);
         
        if ( memberVO != null ){ // �α��� ����
            session.setAttribute("login", memberVO); // ���ǿ� login���̶� �̸����� UserVO ��ü�� ������ ��.
            returnURL ="redirect:/board/list"; // �α��� ������ �Խñ� ����������� �ٷ� �̵��ϵ��� �ϰ�
        }else { // �α��ο� ������ ���
            returnURL ="redirect:/member/login"; // �α��� ������ �ٽ� ������ ��
        }
         
        return returnURL; // ������ ������ returnURL �� ��ȯ�ؼ� �̵���Ŵ              
    }
	
	// �α׾ƿ� �ϴ� �κ�
    @PostMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // ���� ��ü�� ��������
//      session.removeAttribute("login"); // �ϳ��� �Ϸ��� �̷��� �ص� ��.
        return "redirect:/board/list"; // �α׾ƿ� �� �Խñ� ������� �̵��ϵ���...��
    }
	
	@GetMapping("/regist")
    // => @RequestMapping(value="regist", method=RequestMethod.GET)
    public void memberReigstGET() {
        
        log.info("register page");
        
    }
	
	// ȸ�� ��� 
    @PostMapping("/regist")
    // => @RequestMapping(value="regist", method=RequestMethod.POST)
    public String memberReigstPOST(MemberVO member, RedirectAttributes rttr) {

        log.info("MemberVO : " + member);
        memberService.registMember(member);
        
        rttr.addFlashAttribute("result", "regist success");
        
        return "redirect:/member/login";
    }
    
 // ���̵� üũ
    @PostMapping("/idCheck")
    @ResponseBody
    public String idCheck(String memberId) throws Exception{
		
    	log.info("memberIdChk() ����");
		
		int result = memberService.idCheck(memberId);
		
		log.info("����� = " + result + " �� : " + memberId);
		
		if(result != 0) {
			
			return "fail";	// �ߺ� ���̵� ����
			
		} 
		else {
			
			return "success";	// �ߺ� ���̵� x
			
		}
		
	}
    
    // �г��� üũ
    @PostMapping("/nicknameCheck")
    @ResponseBody
    public String nicknameCheck(String nickname) throws Exception{
		
    	log.info("nicknameCheck() ����");
		
		int result = memberService.nicknameCheck(nickname);
		
		log.info("����� = " + result + " �� : " + nickname);
		
		if(result != 0) {
			
			return "fail";	// �ߺ� ���̵� ����
			
		} 
		else {
			
			return "success";	// �ߺ� ���̵� x
			
		}
		
	}
}
