package my.toy.dto;

import java.sql.Date;

public class boardDTO {
	private int seq;
	private String title;
	private String contents;
	private int view_count;
	private Date write_date;
	public boardDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public boardDTO(int seq, String title, String contents, int view_count, Date write_date) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.view_count = view_count;
		this.write_date = write_date;
	}
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
}
