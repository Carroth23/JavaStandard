package com.toy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.dao.BoardDAO;
import com.toy.dto.BoardDTO;

@Service
public class BoardService {

	@Autowired
	BoardDAO boardDao;
	
	public List<BoardDTO> selectAll() {
		return boardDao.selectAll();
	}
}
