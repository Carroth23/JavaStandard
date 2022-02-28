package com.toy.dao;

import java.util.HashMap;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
