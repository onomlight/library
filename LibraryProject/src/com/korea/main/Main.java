package com.korea.main;

import com.korea.controller.FrontController;
import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;
import com.korea.view.Viewer;

public class Main {

	public static void main(String[] args) {
		
//		Viewer viewer = new Viewer();
//		viewer.MainMenu();

		//1) BookDAO - BookDTO 테스트
//		BookDTO dto = new BookDTO("1010","열혈C언어","윤성우","오렌지미디어",0);
//		BookDAO dao = new BookDAO();
//		
//		dao.Insert(dto); // 성공여부 확인
	
	// 2 Controller-Service -Dao 확인
//		FrontController controller = new FrontController();
//		BookDTO dto = new BookDTO("2020","이것이자바냐?","홍길동","00미디어",0);
//		controller.SubControllerEX("BOOK", 2, dto ); // 서비스명,작업번호 , 전달위치
//				
	
		
		// 3 View - Controller
		
		Viewer view1 = new Viewer();
		view1.BookMenu();
	}
	

}
