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
	
	public int totalRow(String category, String search) {
		Map<String, String> map = new HashMap<>();
		map.put("category", category);
		map.put("search", search);
		return mybatis.selectOne("Board.totalRow", map);
	}
	
	public List<BoardDTO> getBoardList(int getRow, int whereRow, String category, String search){
		Map<String, String> map = new HashMap<>();
		map.put("getRow", String.valueOf(getRow));
		map.put("whereRow", String.valueOf(whereRow));
		map.put("category", category);
		map.put("search", search);
		System.out.println("getRow : " + getRow);
		System.out.println("whereRow : " + whereRow);
		System.out.println("category : " + category);
		System.out.println("search : " + search);
		return mybatis.selectList("Board.getBoardList", map);
	}
}
