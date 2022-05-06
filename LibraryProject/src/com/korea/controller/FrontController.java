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
		 map.put("AUTH", new AuthController());
	}
	//MAP에 있는 서브컨트롤러를 꺼내어 해당 컨트롤러를 실행하는 함수 
	public boolean SubControllerEX(String menu, int num , DTO dto) {
		SubController tmp; // 사용자가 요청하는 컨트롤러와 직원/회원 로그인에 대한 번호 전달되고 사용자에게 전달받은 dto가 전달됨 
		if(menu.equals("BOOK")) 
		{
			
		tmp = map.get("BOOK"); // BookController를 꺼내어 tmp에 연결
		return tmp.execute(num, dto); 	// 서브컨트롤러 execute실후 결과 (true/false)를 view 로 전달
										// num : 1 (조회 ) 2 (삽입) 3(수정) 4(삭제)
		}
		else if(menu.equals("AUTH"))
		{
			tmp=map.get("AUTH");//AuthController 를 꺼내어 tmp에 연결
			return tmp.execute(num, dto); // 회원인지 직원인지를 확인  / id pw 담긴걸 확인
										  // 서브컨트롤러 exectue 실행 결과 (true/false)를 view 로 전달
										  // num ==1  회원로그인 / num==2 직원ㄹ로그인
		}
		return false;
	}
}
