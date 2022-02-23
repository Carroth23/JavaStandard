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
	
	public List<boardDTO> getList(int currentPage){
		int start = currentPage * Statics.ROW_PER_COUNT - (Statics.ROW_PER_COUNT - 1);
		int end = currentPage * Statics.ROW_PER_COUNT;
		return bdao.getList(start, end);
	}
	
	public String getNavi(int currentPage) {
		int totalPage = totalPage();
		int startNavi = (currentPage - 1) / 10 * 10 + 1;
		int endNavi = startNavi + 10 - 1;
		if(endNavi > totalPage) {
			endNavi = totalPage;
		}
		boolean prev = true;
		boolean next = true;
		if(startNavi == 1) {
			prev = false;
		}
		if (endNavi == totalPage) {
			next = false;
		}
		String pageNavi = "";
		if(prev) {
			pageNavi += "<a href='/board/list?cpage=" + (startNavi - 1) + "'><</a>";
		}
		for(int i = startNavi; i <= endNavi; i++) {
			pageNavi += "<a href='/board/list?cpage=" + i + "'>" + i + "</a>";
			System.out.println("몇번 돔? : " + i);
		}
		if(next) {
			pageNavi += "<a href='/board/list?cpage=" + (endNavi + 1) + "'>></a>";
		}
		return pageNavi;
	}
}
