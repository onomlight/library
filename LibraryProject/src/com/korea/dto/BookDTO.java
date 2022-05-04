package com.korea.dto;

public class BookDTO {

	private String BookCode;
	private String BookName;
	public BookDTO(String bookCode, String bookName) {
		super();
		BookCode = bookCode;
		BookName = bookName;
	}
	//Getter and Setter
	public String getBookCode() {
		return BookCode;
	}
	public void setBookCode(String bookCode) {
		BookCode = bookCode;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	@Override
	public String toString() {
		return "BookDTO [BookCode=" + BookCode + ", BookName=" + BookName + "]";
	}
	
	

}
