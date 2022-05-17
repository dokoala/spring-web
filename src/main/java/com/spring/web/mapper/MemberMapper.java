package com.spring.web.mapper;

import com.spring.web.model.LoginDTO;
import com.spring.web.model.MemberVO;

public interface MemberMapper {
	
	/* 회원 등록 */
	public void registMember(MemberVO member);
	
	/* 로그인 체크 */
	public MemberVO login(MemberVO member);

	/* 로그인 체크2 */
	public MemberVO login2(LoginDTO loginDTO);
}
