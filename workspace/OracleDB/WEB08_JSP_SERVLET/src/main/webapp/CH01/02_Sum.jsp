<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>02_Sum.jsp</title>
</head>
<body>
	<!-- JSP 는 JAVA 에서 사용하던 거의 모든 문법이 동일하게 사용됨 -->
	<%
		int sum = 0;		// 변수 선언
		for (int i=1;i<=100;++i){		// 반복 실행문
			sum += i;								// 누적 연산
		}
	%>
	<h2>1에서 100까지의 합 : <%=sum %></h2>
	
	<%
		sum = 0;
	for (int i=1;i<=10;++i){
		sum += i;
	%>
		<h2>1에서 <%=i%>까지의 합 : <%=sum %></h2>
	<%
	}
	%>
</body>
</html>