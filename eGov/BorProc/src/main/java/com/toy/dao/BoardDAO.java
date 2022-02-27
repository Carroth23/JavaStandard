package com.toy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.toy.dto.BoardDTO;

@Repository
public class BoardDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public int totalRow(String category, String searchPage) {
		Map<String, String> map = new HashMap<>();
		map.put("category", category);
		map.put("searchTxt", searchPage);
		return mybatis.selectOne("Board.totalRow", map);
	}
	
	public List<BoardDTO> defaultList(int start, int end){
		Map<String, String> map = new HashMap<>();
		map.put("start", String.valueOf(start));
		map.put("end", String.valueOf(end));
		return mybatis.selectList("Board.defaultList", map);
	}
	
	public List<BoardDTO> searchList(int start, int end, String category, String searchTxt){
		Map<String, String> map = new HashMap<>();
		map.put("start", String.valueOf(start));
		map.put("end", String.valueOf(end));
		map.put("category", category);
		map.put("searchTxt", searchTxt);
		return mybatis.selectList("Board.searchList", map);
	}
	
	public List<BoardDTO> searchList(int start, int end, String searchTxt){
		Map<String, String> map = new HashMap<>();
		map.put("start", String.valueOf(start));
		map.put("end", String.valueOf(end));
		map.put("searchTxt", searchTxt);
		return mybatis.selectList("Board.searchListNoCategory", map);
	}
	
	// 글쓰기
	public int write(String title, String contents, String category, String writer) {
		Map<String, String> map = new HashMap<>();
		map.put("title", title);
		map.put("contents", contents);
		map.put("category", category);
		map.put("writer", writer);
		return mybatis.insert("Board.write", map);
	}
}
