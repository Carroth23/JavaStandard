package com.toy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.dao.BoardDAO;
import com.toy.dto.BoardDTO;
import com.toy.dto.PageDTO;
import com.toy.statics.Statics;

@Service
public class BoardService {

	@Autowired
	BoardDAO boardDao;

	// 카테고리 대비
	public String categoryDepender(String category) {
		if (category == null || category.equals("")) {
			category = "선택";
		}
		return category;
	}

	// 검색어 대비
	public String searchDepender(String search) {
		if (search == null) {
			search = "";
		}
		return search;
	}

	public int totalRow(String category, String search) {
		System.out.println("전체 게시글 수 : " + boardDao.totalRow(category, search));
		return boardDao.totalRow(category, search);
	}

	public int totalPage(String category, String search) {
		int totalPage = 0;
		int totalRow = totalRow(category, search);
		if (totalRow % Statics.PAGE_PER_ROW == 0) {
			totalPage = totalRow / Statics.PAGE_PER_ROW;
		} else {
			totalPage = totalRow / Statics.PAGE_PER_ROW + 1;
		}
		return totalPage;
	}

	public int pageDepender(String category, String search, String cpage) {
		if(cpage == null) {
			cpage = "1";
		}
		if(cpage.equals("")) {
			cpage = "1";
		}
		int currentPage = Integer.parseInt(cpage);
		int totalPage = totalPage(category, search);
		if(currentPage > totalPage) {
			currentPage = totalPage;
		}
		if (currentPage < 1) {
			currentPage = 1;
		}
		return currentPage;
	}
	
	public List<BoardDTO> getBoardList(int currentPage, String category, String search){
		int getRow = Statics.PAGE_PER_ROW;
		int whereRow = (currentPage - 1) * Statics.PAGE_PER_ROW;
		return boardDao.getBoardList(getRow, whereRow, category, search);
	}
	
	public PageDTO getPage(int currentPage, String category, String search) {
		PageDTO page = new PageDTO();
		page.setCurrentPage(currentPage);
		int startPage = (currentPage - 1) / Statics.NAVI_PER_PAGE * Statics.NAVI_PER_PAGE + 1;
		int endPage = startPage + (Statics.NAVI_PER_PAGE - 1);
		if(endPage > totalPage(category, search)) {
			endPage = totalPage(category, search);
		}
		page.setStartPage(startPage);
		page.setEndPage(endPage);
		page.setCategory(category);
		page.setSearch(search);
		return page;
	}
	
	
}
