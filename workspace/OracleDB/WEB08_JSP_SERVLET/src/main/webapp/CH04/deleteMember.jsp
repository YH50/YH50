<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%
	//deleteMember.jsp
	//스크립트를 이용해서 "정말로 삭제할까요?"로 물어보고 확인=삭제, 취소=되돌아가기
	//삭제 완료 시 MemberMGR.jsp 로 가기 전에 "삭제 완료했십니다" 라고 경고창 띄우기
%>

<script type="text/javascript">
	var ans = confirm("정말로 삭제할까요?");
	if(!ans) {
		history.go(-1)
	}else{
		alert("삭제했십니데이 ㅂㅇ");
	}
</script>

<%
Connection con = null;
PreparedStatement pstmt = null;

String driver = "com.mysql.cj.jdbc.Driver";
String url = "jdbc:mysql://localhost:3306/scott";
String id = "root";
String pw = "adminuser";

String userid = request.getParameter("id");
String sql = "delete from members where id=?";

try{
	   Class.forName(driver);
	   con = DriverManager.getConnection(url, id, pw);
	   pstmt = con.prepareStatement(sql);
	   pstmt.setString(1, userid);
	   pstmt.executeUpdate();
	}catch(Exception e){   e.printStackTrace();
	}finally{
	   try {
		   if (pstmt != null) pstmt.close();
	       if (con != null)   con.close();
	   } catch (Exception e) {   e.printStackTrace();   }
	}
%>

<script type="text/javascript">
	location.href='MemberMGR.jsp';
</script>