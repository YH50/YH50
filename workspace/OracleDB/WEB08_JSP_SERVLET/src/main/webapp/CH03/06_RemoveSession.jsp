<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>06_RemoveSession.jsp</title>
</head>
<body>
<%
	session.setAttribute("s_name1", "세션에 저장된 첫번째값이라예");
	session.setAttribute("s_name2", "세션에 저장된 두번째값이라예");
	session.setAttribute("s_name3", "세션에 저장된 세번째값이라예");
	
	out.print("<h3> >> 세션 값 삭제하기 전<< </h3>");
	String value = (String)session.getAttribute("s_name1");
	out.println("<h3>s_name1 : " + value + "</h3>");
	value = (String)session.getAttribute("s_name2");
	out.println("<h3>s_name2 : " + value + "</h3>");
	value = (String)session.getAttribute("s_name3");
	out.println("<h3>s_name3 : " + value + "</h3>");
	
	session.removeAttribute("s_name2");
	
	out.print("<h3> >> 세션 값 하나를 삭제한 경우 << </h3>");
	value = (String)session.getAttribute("s_name1");
	out.println("<h3>s_name1 : " + value + "</h3>");
	value = (String)session.getAttribute("s_name2");
	out.println("<h3>s_name2 : " + value + "</h3>");
	value = (String)session.getAttribute("s_name3");
	out.println("<h3>s_name3 : " + value + "</h3>");
	
	session.invalidate();
	
	out.print("<h3> >> 모든 세션 값을 삭제한 경우 << </h3>");
/* 	value = (String)session.getAttribute("s_name1");
	out.println("<h3>s_name1 : " + value + "</h3>");
	//value = (String)session.getAttribute("s_name2");
	out.println("<h3>s_name2 : " + value + "</h3>");
	value = (String)session.getAttribute("s_name3");
	out.println("<h3>s_name3 : " + value + "</h3>"); */
	out.print("세션이 다 날라갔심더");
%>
</body>
</html>