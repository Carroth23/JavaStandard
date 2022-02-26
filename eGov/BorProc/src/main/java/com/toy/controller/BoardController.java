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
	public String list(Model model) {
		model.addAttribute("list", boardService.selectAll());
		return "/board/list";
	}
	
	@RequestMapping("search")
	public String search(HttpServletRequest request) {
		String category = request.getParameter("category");
		String searchTxt = request.getParameter("searchTxt");
		System.out.println("선택 카테고리 : " + category + ", 검색어 : " + searchTxt);
		return "/board/list";
	}
	
}
