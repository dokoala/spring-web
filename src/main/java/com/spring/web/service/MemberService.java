package com.spring.web.service;

import com.spring.web.model.LoginDTO;
import com.spring.web.model.MemberVO;

public interface MemberService {

	/* ��� ��� */
	public void registMember(MemberVO member);
	
	/* �α��� */
	public MemberVO login(MemberVO member);
	
	/* �α���2 */
	public MemberVO login2(LoginDTO loginDTO);
}
