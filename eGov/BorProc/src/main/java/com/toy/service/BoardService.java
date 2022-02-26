package com.toy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.dao.BoardDAO;
import com.toy.dto.BoardDTO;
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
	
	public int pageDepender(Integer cpage) {
		if(cpage == null || cpage < 1) {
			cpage = 1;
		}
		if(cpage > totalPage()) {
			cpage = totalPage();
		}
		int currentPage = cpage.intValue();
		return currentPage;
	}
	
	public List<BoardDTO> defaultList(int currentPage){
		int start = currentPage * Statics.PAGE_FOR_ROW - (Statics.PAGE_FOR_ROW - 1);
		int end = start + (Statics.PAGE_FOR_ROW - 1);
		return boardDao.defaultList(start, end);
	}
	
	public String navi(int currentPage) {
		int start = (currentPage - 1) / Statics.PAGE_FOR_NAVI * Statics.PAGE_FOR_NAVI + 1;
		int end = start + (Statics.PAGE_FOR_NAVI - 1);
		if (end > totalPage()) {
			end = totalPage();
		}
		System.out.println(totalPage());
		String navi = "";
		for(int i = start; i <= end; i++) {
			navi += "<a href='/board/list?cpage=" + i + "'>" + i + "</a>";
		}
		return navi;
	}
}
