package com.toy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.dao.BoardDAO;
import com.toy.dto.BoardDTO;
import com.toy.dto.NaviDTO;
import com.toy.statics.Statics;

@Service
public class BoardService {

	@Autowired
	BoardDAO boardDao;

	public int totalRow(String category, String searchPage) {
		System.out.println("총 게시물 수 : " + boardDao.totalRow(category, searchPage));
		return boardDao.totalRow(category, searchPage);
	}

	public int totalPage(String category, String searchPage) {
		int totalRow = totalRow(category, searchPage);
		int totalPage = 0;
		if (totalRow % Statics.PAGE_FOR_ROW == 0) {
			totalPage = totalRow / Statics.PAGE_FOR_ROW;
		} else {
			totalPage = totalRow / Statics.PAGE_FOR_ROW + 1;
		}
		return totalPage;
	}

	public String searchDepender(String searchTxt) {
		if (searchTxt == null) {
			searchTxt = "";
		}
		return searchTxt;
	}

	public String categoryDepender(String category) {
		if (category == null) {
			category = "선택";
		}
		if (category.equals("")) {
			category = "선택";
		}
		return category;
	}

	public int pageDepender(String cpage, String category, String searchTxt) {
		if (cpage == null || cpage == "") {
			cpage = "1";
		}
		int currentPage = Integer.parseInt(cpage);
		if (currentPage < 1) {
			currentPage = 1;
		}
		if (currentPage > totalPage(category, searchTxt)) {
			currentPage = totalPage(category, searchTxt);
		}
		return currentPage;
	}

	public List<BoardDTO> boardList(int currentPage, String category, String searchTxt) {
		int start = currentPage * Statics.PAGE_FOR_ROW - (Statics.PAGE_FOR_ROW - 1);
		int end = start + (Statics.PAGE_FOR_ROW - 1);
		if (category == null && searchTxt == null || category.equals("") && searchTxt.equals("")) {
			return boardDao.defaultList(start, end);
		} else {
			if (category.equals("선택")) {
				return boardDao.searchList(start, end, searchTxt);
			}
			return boardDao.searchList(start, end, category, searchTxt);
		}
	}

	public NaviDTO navi(int currentPage, String category, String searchTxt) {
		NaviDTO navi = new NaviDTO();
		int start = (currentPage - 1) / Statics.PAGE_FOR_NAVI * Statics.PAGE_FOR_NAVI + 1;
		int end = start + (Statics.PAGE_FOR_NAVI - 1);
		if (end > totalPage(category, searchTxt)) {
			end = totalPage(category, searchTxt);
		}
		navi.setStart(start);
		navi.setEnd(end);
		navi.setCategory(category);
		navi.setSearchTxt(searchTxt);
		return navi;
	}
}
