package com.spring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.mapper.MemberMapper;
import com.spring.web.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public void registMember(MemberVO member) {		
		System.out.println(member);
		memberMapper.registMember(member);
		
	}
	
	
}
