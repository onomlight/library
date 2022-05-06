package com.korea.dto;

public class BookDTO extends DTO{

	private String book_Code;
	private String book_Name;
	private String book_Author;
	private String publisher;
	private int isRantal;
	
	// 생성자( 모든필드 적용)
	public BookDTO(String book_Code, String book_Name, String book_Author, String publisher, int isRantal) {
		super();
		this.book_Code = book_Code;
		this.book_Name = book_Name;
		this.book_Author = book_Author;
		this.publisher = publisher;
		this.isRantal = isRantal;
	}

	
	
	//Getter an Setter 적용 // 모든필드 적용해야함 
	public String getBook_Code() {
		return book_Code;
	}

	public void setBook_Code(String book_Code) {
		this.book_Code = book_Code;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	public String getBook_Author() {
		return book_Author;
	}

	public void setBook_Author(String book_Author) {
		this.book_Author = book_Author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getIsRantal() {
		return isRantal;
	}

	public void setIsRantal(int isRantal) {
		this.isRantal = isRantal;
	}

	//toString () 적용

	@Override
	public String toString() {
		return "BookDTO [book_Code=" + book_Code + ", book_Name=" + book_Name + ", book_Author=" + book_Author
				+ ", publisher=" + publisher + ", isRantal=" + isRantal + "]";
	}
	
	
	
	
	

	
	
	
}
