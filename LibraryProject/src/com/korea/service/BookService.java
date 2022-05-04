package com.korea.service;

import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;

public class BookService {

	//Dao와 연결
	BookDAO dao = new BookDAO();
	
	
	//조회
	public void Select() {
		
	}
	//삽입
	public void Insert(BookDTO dto) {
		dao.Insert(dto); // dao 의 insert 기능사용
	}
	//수정
	public void Update() {
		
	}
	//삭제
	public void Delete() {
		
	}
}
