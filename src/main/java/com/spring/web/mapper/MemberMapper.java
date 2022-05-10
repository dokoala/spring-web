package com.spring.web.mapper;

import java.util.List;

import com.spring.web.model.MemberVO;

public interface MemberMapper {
	
	/* 회원 등록 */
	public void registMember(MemberVO member);
}
