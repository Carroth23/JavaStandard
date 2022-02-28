package com.toy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.dao.BoardDAO;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO boardDao;
	
	// 카테고리 대비
	public String categoryDepender(String category) {
		if(category == null || category.equals("")) {
			category = "선택";
		}
		return category;
	}
	
	// 검색어 대비
	public String searchDepender(String search) {
		if(search == null) {
			search = "";
		}
		return search;
	}
	
	public int totalRow (String category, String search) {
		boardDao.totalRow(category, search);
	}
	
	public int pageDepender(String category, String search, String cpage) {
		
	}
}
