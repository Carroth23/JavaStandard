package com.toy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toy.dto.MemberDTO;
import com.toy.service.MemberService;

@Controller
@RequestMapping("/controller/member/")
public class MemberController {
	
	@Autowired
	HttpSession session;
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping("signup")
	public String signup(MemberDTO dto) {
		memberService.signup(dto);
		return "redirect:/";
	}
	
	@RequestMapping("login")
	public String login(String id, String pw) {
		memberService.login(id, pw);
		session.setAttribute("id", id);
		return "/board/list";
	}
}
