package com.korea.main;

import com.korea.domain.BookDAO;
import com.korea.dto.BookDTO;
import com.korea.view.Viewer;

public class Main {

	public static void main(String[] args) {
		
//		Viewer viewer = new Viewer();
//		viewer.MainMenu();

		// BookDAO - BookDTO 테스트
		BookDTO dto = new BookDTO("1010","열혈C언어","윤성우","오렌지미디어",0);
		BookDAO dao = new BookDAO();
		
		dao.Insert(dto); // 성공여부 확인
	}

}
