package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert {

	public static void main(String[] args) {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";
		String id = "scott";
		String pw = "tiger";
		Connection con = null;
		PreparedStatement pstmt = null;		
		
		try {
			Class.forName(driver);			
			con = DriverManager.getConnection(url, id, pw);
			Scanner sc = new Scanner(System.in);
			
			System.out.print("번호 입력 : ");
			int num = Integer.parseInt(sc.nextLine());
			System.out.print("이름 입력 : ");
			String name = sc.nextLine();
			System.out.print("이메일 입력 : ");
			String email = sc.nextLine();
			System.out.print("전화번호 입력 : ");
			String phone = sc.nextLine();
			
			//String sql = "insert into customer values(6, '김하나', 'abc5@abc.com', '010-1235-5678')";
//			String sql = "insert into customer values("
//						+ num + ", ' " + name + " ', '" + email + " ', ' " + phone + " ')";
//			위에꺼는 옛날 방식
			
			//요즘 방식
			String sql = "insert into customer values(?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql);
			
			//변수들이 물음표 순서에 맞게 매칭되어 구성됨.
			pstmt.setInt(1, num);
			pstmt.setString(2,  name);
			pstmt.setString(3,  email);
			pstmt.setString(4,  phone);
			//setInt 와 setString 이 자동으로 필요한 따옴표를 붙여서
			// sql 명령을 구성시켜줌.
			
			int result = pstmt.executeUpdate();
			
			if(result == 1) System.out.println("레코드 추가 성공");
			else System.out.println("레코드 추가 실패");

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(con != null) con.close();
			if(pstmt != null) pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
}