package com.korea.service;

import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;

public class BookService {
		//맴버
	BookDAO dao = new BookDAO();
	
	
	// 조회
	
	//추가
	public boolean Insert(BookDTO dto) {
		return dao.Insert(dto); // 전달받은 dto를 dao로 넘김
								// 그리고 반환되는 값을 controller로 전달 (True /False);
	}
	//수정
	
	//삭제
	
}