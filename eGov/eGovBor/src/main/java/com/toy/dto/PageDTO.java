package com.toy.dto;

public class PageDTO {
	private int currentPage;
	private int startPage;
	private int endPage;
	private String category;
	private String search;
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	public PageDTO(int currentPage, int startPage, int endPage, String category, String search) {
		super();
		this.currentPage = currentPage;
		this.startPage = startPage;
		this.endPage = endPage;
		this.category = category;
		this.search = search;
	}
	public PageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
