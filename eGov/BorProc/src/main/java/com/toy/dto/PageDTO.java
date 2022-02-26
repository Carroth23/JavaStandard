package com.toy.dto;

public class PageDTO {
	private int cpage;
	private int start;
	private int end;
	private String category;
	private String searchTxt;
	public PageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageDTO(int cpage, int start, int end, String category, String searchTxt) {
		super();
		this.cpage = cpage;
		this.start = start;
		this.end = end;
		this.category = category;
		this.searchTxt = searchTxt;
	}
	public int getCpage() {
		return cpage;
	}
	public void setCpage(int cpage) {
		this.cpage = cpage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSearchTxt() {
		return searchTxt;
	}
	public void setSearchTxt(String searchTxt) {
		this.searchTxt = searchTxt;
	}
}
