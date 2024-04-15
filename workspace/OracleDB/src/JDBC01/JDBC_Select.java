package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Select {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String id = "scott";
		String pw = "tiger";
		Connection con = null;
		//SQL 명령을 담고 실행해서 결과를 얻어오는 클래스
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, id, pw);
			//System.out.println("데이터베이스 연결 성공입니다.");
			
			//SQL 문을 String 형식으로 작성 후 변수에 저장.
			String sql = "select * from customer";
			
			//String 변수 sql 에 담긴 SQL 명령을 연결된 객체 con과 함께 pstmt 에 장착.
			pstmt = con.prepareStatement(sql);
			
//			ResultSet rs = null;
//			rs = pstmt.executeQuery();
			rs = pstmt.executeQuery();
			
			System.out.println("번호\t이름\t\t이메일\t\t\t 전화번호");
			System.out.println("===================================");

			//rs.next();		>> 저장된 결과가 rs에 담겨있는 동안
			// 					현재 위치에서 다음 레코드로 이동했을때
			//					다음 레코드가 존재한다면 true, 없으면 false 리턴하는 메소드
			
			while(rs.next()) {
				// rs.getInt() : number 형 필드값 추출용 메소드
				// >> 괄호 안에 필드 이름 정확히 써야함
				// rs.getString() : varchar2 형 필드값 추출용 메소드
				// 모든 자료형에 대해 get~() 메소드가 모두 존재함.
			
				int num = rs.getInt("num");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String tel = rs.getString("tel");
				System.out.printf("%d\t%s\t\t%s\t%s\n", num, name, email, tel);

			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
}
