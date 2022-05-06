package com.korea.controller;

import com.korea.dto.DTO;

public interface SubController {
	
	boolean execute(int num, DTO dto);
	// 상위클래스 참조변수인 bookdto 필요함
	// DTO팩에서 DTO 를 추가하면 추가 변수를추가해서 전체적으로 다 사용할수있음
	

}
