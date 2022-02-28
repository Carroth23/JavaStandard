package com.toy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toy.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("list")
	public String list(HttpServletRequest request, Model model) {
		String category = boardService.categoryDepender(request.getParameter("category"));
		String search = boardService.searchDepender(request.getParameter("search"));
		request.getParameter("cpage");
		int currentPage = 
		return "/board/list";
	}
}
