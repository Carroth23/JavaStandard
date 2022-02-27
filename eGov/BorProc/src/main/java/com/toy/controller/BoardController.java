package com.toy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toy.dto.BoardDTO;
import com.toy.dto.NaviDTO;
import com.toy.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("list")
	public String list(Model model, HttpServletRequest request) {
		String cpage = request.getParameter("cpage");
		System.out.println("변환 전 카테고리 : " + request.getParameter("category"));
		System.out.println("변환 전 검색어 : " + request.getParameter("searchTxt"));
		String category = boardService.categoryDepender(request.getParameter("category"));
		String searchTxt = boardService.searchDepender(request.getParameter("searchTxt"));
		System.out.println("변환 후 카테고리 : " + category);
		System.out.println("변환 후 검색어 : " + searchTxt);
		
		int currentPage = boardService.pageDepender(cpage, category, searchTxt);
		List<BoardDTO> list = boardService.boardList(currentPage, category, searchTxt);
		NaviDTO navi = boardService.navi(currentPage, category, searchTxt);
		model.addAttribute("navi", navi);
		model.addAttribute("list", list);
		return "/board/list";
	}
	
}
