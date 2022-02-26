package com.toy.dto;

public class MemberDTO {
	private int mem_seq;
	private String name;
	private String id;
	private String pw;
	public int getMem_seq() {
		return mem_seq;
	}
	public void setMem_seq(int mem_seq) {
		this.mem_seq = mem_seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public MemberDTO(int mem_seq, String name, String id, String pw) {
		super();
		this.mem_seq = mem_seq;
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	public MemberDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
