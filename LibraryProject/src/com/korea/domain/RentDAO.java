package com.korea.domain;

public class RentDAO extends DAO{

	
	
	//누가(member_Tbl.id) 어떤책(book_tbl.book_code)을 대여하나?
	public void Update(String id, String code) {
		
		
		try {
			conn.setAutoCommit(false);	 
			
			//book_tbl의 대여가능상태를 확인(1이면 대여가능) 
			pstmt = conn.prepareStatement("select isrental from book_tbl where book_code=?");
			pstmt.setString(1, code);
			rs=pstmt.executeQuery();
			rs.next();
			int isrental=rs.getInt("isRental");
			System.out.println("렌탈가능 여부 : " + isrental);
			
			if(isrental==1)
			{
				//Rental tbl에 대여도서 정보 등록
				pstmt=conn.prepareStatement("insert into Rental_tbl values(null,?,?)");
				pstmt.setString(1, code);
				pstmt.setString(2, id);	
				pstmt.executeUpdate();
				System.out.println("대여정보 추가 완료");
				//book_tbl에 대여가능상태를 false로지정(0값넣기)
				pstmt = conn.prepareStatement("update book_tbl set isrental=0 where book_code=?");
				pstmt.setString(1, code);
				pstmt.executeUpdate();
				System.out.println("대여가능 상태 0로 변경");
				
			}
			else
			{
				
			}
			
			conn.commit();	
			
		}catch(Exception e) {
			
			try{conn.rollback();}catch(Exception e1) {e1.printStackTrace();}
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		RentDAO test = new RentDAO();
		//ID , CODE
		test.Update("aaa", "1010");
		//test.Update("aaa", "2020");
	}
	
}
