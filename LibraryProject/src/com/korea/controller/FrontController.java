package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.BookDTO;

public class FrontController {
	// 각각의 컨트롤러를 객체형으로 가질것.
	// 서브 컨트롤러를 담는 컬랙션 지정
	
	public FrontController(){
		Init();
	}
	Map<String,SubController> map = new HashMap();
	// 서브컨트롤러를 Map에 등록
	void Init() {
		map.put("BOOK", new BookController());
		map.put("AUTH", new AuthController());
//		map.put("EMPLOYEE", new EmployeeController());
//		map.put("MEMBER", new MemberController());
	}
	public void SubConExecute(String menu,int num,BookDTO dto) {
		if(menu.equals("BOOK")) {
			//도서관련 요청 (num === (1:조회 2 삽입 3 수정 4 삭제)
			
			SubController sub =map.get("BOOK"); // BookController를 map 에서 꺼내옴
			sub.execute(num,dto); // 요청번호 , 도서정보를 BookController 의 execute로 전달 
			
			
		}else if(menu.equals("AUTH")) {
			//로그인 or 로그아웃 요청
		}else if(menu.equals("MEMBER")) {
			// 맴버관련 요청(맴버조회,수정,탈퇴....)
		}
	}

}
