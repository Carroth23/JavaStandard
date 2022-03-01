package com.toy.dto;

import java.sql.Date;

public class BoardDTO {
	private int seq;
	private String title;
	private String contents;
	private String category;
	private int view_count;
	private Date write_date;
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
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
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public BoardDTO(int seq, String title, String contents, String category, int view_count, Date write_date) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.category = category;
		this.view_count = view_count;
		this.write_date = write_date;
	}
	public BoardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
