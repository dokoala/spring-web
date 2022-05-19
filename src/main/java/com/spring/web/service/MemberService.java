package com.spring.web.service;

import com.spring.web.model.LoginDTO;
import com.spring.web.model.MemberVO;

public interface MemberService {

	/* 멤버 등록 */
	public void registMember(MemberVO member);
	
	/* 로그인 */
	public MemberVO login(MemberVO member);
	
	/* 로그인2 */
	public MemberVO login2(LoginDTO loginDTO);

	/* 아이디 체크 */
	public int idCheck(String id);

	/* 닉네임 체크 */
	public int nicknameCheck(String nickname);
}
