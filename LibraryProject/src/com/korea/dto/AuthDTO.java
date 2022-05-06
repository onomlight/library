package com.korea.dto;
// id pw 받는 클래스

public class AuthDTO extends DTO {

	
	private String id;
	private String pw;
	// 생성자
	public AuthDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
		
	}
	
	
	// getter and setter
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

	// tho string()

	@Override
	public String toString() {
		return "AuthDTO [id=" + id + ", pw=" + pw + "]";
	}
	
	
	
	
	

	
	
	
	
}
