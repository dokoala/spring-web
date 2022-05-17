package com.spring.web.mapper;

import com.spring.web.model.LoginDTO;
import com.spring.web.model.MemberVO;

public interface MemberMapper {
	
	/* ȸ�� ��� */
	public void registMember(MemberVO member);
	
	/* �α��� üũ */
	public MemberVO login(MemberVO member);

	/* �α��� üũ2 */
	public MemberVO login2(LoginDTO loginDTO);
}
