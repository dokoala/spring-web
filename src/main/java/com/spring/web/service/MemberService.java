package com.spring.web.service;

import com.spring.web.model.MemberVO;

public interface MemberService {

	/* 멤버 등록 */
	public void registMember(MemberVO member);
	
	/* 로그인 */
	public MemberVO login(MemberVO member);
}
