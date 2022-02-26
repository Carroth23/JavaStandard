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
	
	public int totalRow() {
		return mybatis.selectOne("Board.totalRow");
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
}
