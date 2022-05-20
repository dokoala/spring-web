package com.spring.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.web.mapper.MemberMapper;
import com.spring.web.model.LoginDTO;
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

	@Override
	public MemberVO login(MemberVO member) {
		// TODO Auto-generated method stub
		return memberMapper.login(member);
	}

	@Override
	public MemberVO login2(LoginDTO loginDTO) {
		return memberMapper.login2(loginDTO);
	}

    @Override
    public int idCheck(String id) {
        int cnt = memberMapper.idCheck(id);
        return cnt;
    }

	@Override
	public int nicknameCheck(String nickname) {
		int cnt = memberMapper.nicknameCheck(nickname);
        return cnt;
	}

}
