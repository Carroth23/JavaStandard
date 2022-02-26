package com.toy.dto;

import java.sql.Date;

public class BoardDTO {
	private int bor_seq;
	private String title;
	private String contents;
	private String category;
	private String writer;
	private int view_count;
	private Date date;
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoardDTO(int bor_seq, String title, String contents, String category, String writer, int view_count,
			Date date) {
		super();
		this.bor_seq = bor_seq;
		this.title = title;
		this.contents = contents;
		this.category = category;
		this.writer = writer;
		this.view_count = view_count;
		this.date = date;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getBor_seq() {
		return bor_seq;
	}
	public void setBor_seq(int bor_seq) {
		this.bor_seq = bor_seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getView_count() {
		return view_count;
	}
	public void setView_count(int view_count) {
		this.view_count = view_count;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
