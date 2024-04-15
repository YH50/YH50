package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class JDBC_Connect {

	public static void main(String[] args) {
		
		// 1. JDBC 를 통한 DB 연결 클래스 의 객체 : Connection 생성
		Connection con = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String id = "scott";
		String pw = "tiger";

		
		//외부 장치와의 연결은 항상 예외처리를 해줘야함!!
		try {
			//연결될 DB의 드라이버 파일을 지정하는 명령
			Class.forName(driver);
			
			// DriverManager 라는 클래스의 static 메소드
			// : getConnection을 이용하여 실제 DB를 연결하고 결과 객체를 con에 저장.
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("데이터베이스 연결 성공입니다.");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(con != null) con.close();
			System.out.println("데이터베이스 종료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

