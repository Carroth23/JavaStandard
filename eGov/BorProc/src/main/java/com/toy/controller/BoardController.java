package com.toy.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.toy.dto.BoardDTO;
import com.toy.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping("list")
	public String list(Model model, HttpServletRequest request) {
		String cpage = request.getParameter("cpage");
		String category = request.getParameter("category");
		String searchTxt = request.getParameter("searchTxt");
		int currentPage = boardService.pageDepender(cpage);
		System.out.println("cpage : " + cpage);
		System.out.println("currentPage : " + currentPage);
		System.out.println("category : " + category);
		System.out.println("searchTxt : " + searchTxt);
		List<BoardDTO> list = boardService.boardList(currentPage, category, searchTxt);
		String navi = boardService.navi(currentPage);
		model.addAttribute("navi", navi);
		model.addAttribute("list", list);
		return "/board/list";
	}
	
}
