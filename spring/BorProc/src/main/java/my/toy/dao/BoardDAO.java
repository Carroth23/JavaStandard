package my.toy.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.toy.dto.boardDTO;

@Repository
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public int totalRow(){
		return mybatis.selectOne("Board.totalRow");
	}
	
	public List<boardDTO> getList(int start, int end){
		Map<String, String> map = new HashMap<>();
		map.put("start", String.valueOf(start));
		map.put("end", String.valueOf(end));
		return mybatis.selectList("Board.getList", map);
	}
}
