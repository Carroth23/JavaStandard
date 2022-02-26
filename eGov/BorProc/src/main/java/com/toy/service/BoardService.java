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
	
	public int totalRow() {
		return boardDao.totalRow();
	}
	
	public int totalPage() {
		int totalRow = totalRow();
		int totalPage = 0;
		if(totalRow % Statics.PAGE_FOR_ROW == 0) {
			totalPage = totalRow / Statics.PAGE_FOR_ROW;
		} else {
			totalPage = totalRow / Statics.PAGE_FOR_ROW + 1;
		}
		return totalPage;
	}
	
	public int pageDepender(String cpage) {
		if(cpage == null || cpage == "") {
			cpage = "1";
		}
		int currentPage = Integer.parseInt(cpage);
		if(currentPage < 1) {
			currentPage = 1;
		}
		if(currentPage > totalPage()) {
			currentPage = totalPage();
		}
		return currentPage;
	}
	
	public List<BoardDTO> boardList(int currentPage, String category, String searchTxt){
		int start = currentPage * Statics.PAGE_FOR_ROW - (Statics.PAGE_FOR_ROW - 1);
		int end = start + (Statics.PAGE_FOR_ROW - 1);
		if(category == null && searchTxt == null) {
			return boardDao.defaultList(start, end);
		} else {
			if(category.equals("선택")) {
				return boardDao.searchList(start, end, searchTxt);
			}
			return boardDao.searchList(start, end, category, searchTxt);
		}
	}
	
	public NaviDTO navi(int currentPage, String category, String searchTxt) {
		NaviDTO navi = new NaviDTO();
		if(category == null && searchTxt == null) {
			int start = (currentPage - 1) / Statics.PAGE_FOR_NAVI * Statics.PAGE_FOR_NAVI + 1;
			int end = start + (Statics.PAGE_FOR_NAVI - 1);
			if (end > totalPage()) {
				end = totalPage();
			}
			navi.setStart(start);
			navi.setEnd(end);
		}
		return navi;
	}
}
