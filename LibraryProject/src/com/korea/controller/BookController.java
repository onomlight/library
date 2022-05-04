package com.korea.controller;

import com.korea.dto.BookDTO;
import com.korea.service.BookService;

public class BookController implements SubController{

	BookService service = new BookService();
	@Override
	public void execute(int num, BookDTO dto) {
		// TODO Auto-generated method stub
		
		
		// 요청 서비스 확인
		
		switch(num)
		{
			case 1: // 조회 
				break;
			case 2: // 삽입
				service.Insert(dto);
				break;
			case 3: // 수정
				break;
			case 4: // 삭제
				break;
		
		}
	}

}
