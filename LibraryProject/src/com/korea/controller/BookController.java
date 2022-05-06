package com.korea.controller;

import com.korea.dto.BookDTO;
import com.korea.dto.DTO;
import com.korea.service.BookService;

public class BookController implements SubController{
	// 도서관련된 정보를 컨트롤할 클래스
	
	BookService service = new BookService();
	@Override
	public boolean execute(int num, DTO dto) {
		// 다운캐스팅 // 상위클래스여서 내려야사용가능 
		BookDTO bdto  = (BookDTO)dto;
		// 조회1 , 삽입 2, 수정 3, 삭제 4
		
		if(num==1)
		{	
				
		}
		else if (num==2)
		{
			return service.Insert(bdto);
		}
		else if (num==3) 
		{
			
		}
		else if (num==4) 
		{
			
		}
		return false;
	}


}
