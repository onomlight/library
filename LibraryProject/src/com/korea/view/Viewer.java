package com.korea.view;

import java.util.Scanner;


import com.korea.dto.BookDTO;

public class Viewer {
	int num;
	Scanner sc = new Scanner(System.in);
	// 컨트롤러 객체를 추가 
	 
	// 메인메뉴
	public void MainMenu(){ 
	while(true)
	{
		System.out.println("------------------Main-----------------");
		System.out.println("1 도서메뉴");
		System.out.println("2 직원메뉴");
		System.out.println("3 회원메뉴");
		System.out.println("4 종료");
		System.out.println("------------------Main-----------------");
		System.out.print("번호 : ");
		num=sc.nextInt();
		switch(num)
		{
			case 1:// 도서 메뉴
				BookMenu();
				break;
			case 2:// 직원메뉴
				break;
			case 3:// 회원메뉴
				break;
			case 4: // 종료
				System.out.println("프로그램을 종료합니다");
				System.exit(-1);
				break;
			default :
				
		} // switch 끝
		
		} // while 끝
	}
	// 도서메뉴
	public void BookMenu() {
		
		while(true)
		{ // 조회 삽입 수정 삭제
			System.out.println("------------------BOOK-----------------");
			System.out.println("1 Select");
			System.out.println("2 Insert");
			System.out.println("3 Update");
			System.out.println("4 Delete");
			System.out.println("5 Prev");
			System.out.println("------------------BOOK-----------------");
			System.out.print("번호 : ");
			num=sc.nextInt();
			switch(num)
			{
			case 1: // 조회
				System.out.println("책조회요청");
				break;
			case 2: // 삽입
				System.out.println("도서코드|도서명>");
				String Code = sc.next();
				String Name = sc.next();
				 
				 //컨트롤러key,서비스번호,bookdto
						
				break;
			case 3: // 수정
				System.out.println("책수정요청!");
				break;
			case 4: // 삭제
				System.out.println("책수정삭제!");
				break;
			case 5: // 이전으로
				return; // MainMenu로 리턴 
				default: // 잘못누름
					System.out.println("번호 다시 입력하세요~");
			}
		}
	}
	// 인증메뉴
	
	// 직원메뉴
	
	// 회원메뉴
	
}
