package com.korea.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	String id="root";
	String pw="1234";
	String url="jdbc:mysql://localhost:3306/librarydb";
	//ㄴ 연결할 db명 입력 
	//DB연결관련 객체를 위한 참조 변수
	Connection conn=null;				// DB 연결객체
	PreparedStatement pstmt = null;		// SQL 쿼리 전송 객체
	ResultSet rs = null;				// 쿼리결과(Select) 수신용 객체
	DAO()
	{
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
	}
	
	
}