package my.toy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import my.toy.dto.boardDTO;
import my.toy.service.BoardService;

@Controller
@RequestMapping("/board/")
public class BoardController {
	
	@Autowired
	BoardService bService;
	
	@RequestMapping("list")
	public String boardList(int cpage, Model model) {
		int currentPage = bService.pageDefender(cpage);
		List<boardDTO> list = bService.getList(currentPage);
		String navi = bService.getNavi(currentPage);
		model.addAttribute("list", list);
		model.addAttribute("navi", navi);
		return "board/list";
	}
}
