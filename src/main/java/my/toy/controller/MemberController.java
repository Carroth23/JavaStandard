package my.toy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import my.toy.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("login")
	public String login(String id, String pw) {
		session.setAttribute("id", pw);
		System.out.println("들어온 id : " + id);
		return "Home";
	}
}
