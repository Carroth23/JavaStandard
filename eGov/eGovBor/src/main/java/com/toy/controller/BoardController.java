package com.toy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toy.dto.BoardDTO;
import com.toy.dto.PageDTO;
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
		int currentPage = boardService.pageDepender(category, search, request.getParameter("cpage"));
		List<BoardDTO> list = boardService.getBoardList(currentPage, category, search);
		PageDTO page = boardService.getPage(currentPage, category, search);
		model.addAttribute("list", list);
		model.addAttribute("page", page);
		return "/board/list";
	}
}
