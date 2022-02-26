package com.toy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.dao.MemberDAO;
import com.toy.dto.MemberDTO;
import com.toy.utils.Encrypt;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDao;
	
	public int signup(MemberDTO dto) {
		dto.setPw(Encrypt.getSHA512(dto.getPw()));
		return memberDao.signup(dto);
	}
	
	public int login(String id, String pw) {
		String shaPw = Encrypt.getSHA512(pw);
		return memberDao.login(id, shaPw);
	}
	
}
