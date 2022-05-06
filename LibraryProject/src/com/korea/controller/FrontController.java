package com.korea.controller;

import java.util.HashMap;
import java.util.Map;

import com.korea.dto.DTO;

public class FrontController {
	// 서브 컨트롤러 저장용
	Map<String,SubController> map = new HashMap();
	
	public FrontController(){
		Init(); // map 에 Init 에 지정된 대로 서브 컨트롤러가 추가됨
	}
	// 등록할 서비스 지정
	
	private void Init() {
		 map.put("BOOK", new BookController());
	}
	//MAP에 있는 서브컨트롤러를 꺼내어 해당 컨트롤러를 실행하는 함수 
	public boolean SubControllerEX(String menu, int num , DTO dto) {
		SubController tmp;
		if(menu.equals("BOOK")) {
		tmp = map.get("BOOK"); // BookController를 꺼내어 tmp에 연결
		return tmp.execute(num, dto); // 서브컨트롤러 execute실후 결과 (true/false)를 view 로 전달 
		}
		return false;
	}
}
