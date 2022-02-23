package my.toy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.toy.dao.BoardDAO;
import my.toy.dto.boardDTO;
import statics.Statics;

@Service
public class BoardService {
	
	@Autowired
	BoardDAO bdao;
	
	public int totalRow() {
		return bdao.totalRow();
	}
	
	public int totalPage() {
		int totalPage = 0;
		int totalRow = totalRow();
		if(Statics.ROW_PER_COUNT % totalRow == 0) {
			totalPage = totalRow / Statics.ROW_PER_COUNT;
		} else {
			totalPage = totalRow / Statics.ROW_PER_COUNT + 1;
		}
		return totalPage;
	}
	
	public int pageDefender(int cpage) {
		int totalPage = totalPage();
		if(cpage == 0) {
			cpage = 1;
		}
		if(cpage < 0) {
			cpage = 1;
		}
		if(cpage > totalPage) {
			cpage = totalPage;
		}
		System.out.println("바뀐 cpage : " + cpage);
		return cpage;
	}
	
	public List<boardDTO> getList(int cpage){
		int start = cpage * Statics.ROW_PER_COUNT - (Statics.ROW_PER_COUNT - 1);
		int end = cpage * Statics.ROW_PER_COUNT;
		return bdao.getList(start, end);
	}
	
	public String getNavi() {
		int totalPage = totalPage();
		return "";
	}
}
