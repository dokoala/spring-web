package com.spring.web.service;

import com.spring.web.model.MemberVO;

public interface MemberService {

	/* ��� ��� */
	public void registMember(MemberVO member);
	
	/* �α��� */
	public MemberVO login(MemberVO member);
}
