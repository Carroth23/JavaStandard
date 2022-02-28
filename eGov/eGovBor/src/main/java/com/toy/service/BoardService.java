package com.toy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.dao.BoardDAO;
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
}
