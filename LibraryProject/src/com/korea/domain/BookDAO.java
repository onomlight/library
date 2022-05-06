package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.korea.dto.BookDTO;

public class BookDAO {

	
	//연결관련 정보 저장용 변수
			String id="root";
			String pw="1234";
			String url="jdbc:mysql://localhost:3306/librarydb";
			//ㄴ 연결할 db명 입력 
			//DB연결관련 객체를 위한 참조 변수
			Connection conn=null;				// DB 연결객체
			PreparedStatement pstmt = null;		// SQL 쿼리 전송 객체
			ResultSet rs = null;				// 쿼리결과(Select) 수신용 객체

			
			public BookDAO(){ // bookdao가 생성할때마다 연결 
				
			//연결
			try {
				//DB Driver 로드
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver Loading Success!");
				//DB연결객체 생성
				conn=DriverManager.getConnection(url, id, pw);
				System.out.println("DB Connected..");
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}

			}// 생성자 끝
			
			// 도서 정보 조회 num:1
			 public void Select() {}
			// 도서 정보 추가 2
			 public boolean Insert(BookDTO dto) {
				 // boolean으로 잘연결되었는지 T/F로 확인
				 try {
					 pstmt = conn.prepareStatement("insert into book_tbl values(?,?,?,?,?)");
					 pstmt.setString(1, dto.getBook_Code());
					 // 첫번째 물음표 / 첫번째로 북코드를 꺼내서 넣어줌 
					 // 
					 pstmt.setString(2, dto.getBook_Name());
					 
					 pstmt.setString(3, dto.getBook_Author());
					 
					 pstmt.setString(4, dto.getPublisher());
					 
					 pstmt.setInt(5, dto.getIsRantal());
					 int result =  pstmt.executeUpdate();
					 
					 if(result!=0) {
						 return true; // INSERT 성공!
					 }
					 
				 }catch(Exception e) {
					 e.printStackTrace();
				 } finally {
					 try {pstmt.close();}catch(Exception e) {e.printStackTrace();}
				 }
				 return false;
			 }
			// 도서 정보 수정 3
			 public void Update() {}
			// 도서 정보 삭제 4
			 public void Delete() {}
} 

