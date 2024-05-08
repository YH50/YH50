<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>081_Login_forward_servlet.jsp</title>
</head>
<body>

<!-- 서블릿과 포워드를 이용한 로그인 처리 -->
<form method="post" action="../login.do">
	<label for="userid">아이디 : </label><input type="text" name="id"><br>
	<label for="userpwd">암 &nbsp; 호 : </label><input type="password" name="pwd"><br>
	<input type = "submit" value="로그인">
</form>
<!-- 
	정보 입력 페이지(jsp) > 정보 처리 페이지 > 처리 결과 페이지
	** 이와 같은 자료 처리 방식 : 옛날 방식
	
	WEB 서버 : IIS, nginx 등 클라이언트와 서버 간 요청과 응답만 있는 통신 웹 서버
	WAS : Web Application Server : 프로그래밍 언어의 컴파일과 실행 기능이 같이 탑재된 서버
				(톰캣,  Web Logic, JBoss 등)
	
	현재 로그인 구조 : WAS 서버를 이용 & 서블릿을 이용한 처리를 할 예정
	(JSP : 사용하지 않을거임)
 -->
</body>
</html>







