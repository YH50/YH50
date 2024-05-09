<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_getSession.jsp</title>
</head>
<body>

<h3>세션에 저장된 값을 하나씩 추출<br />
<%
	String id = (String) session.getAttribute("id");
	String pwd = (String) session.getAttribute("pwd");
	Integer age = (Integer) session.getAttribute("age");
%>
	id : <%=id %><br>
	pwd : <%=pwd %><br>
	age : <%=age %><br>
	
	<h3>세션에 설정된 모든 값 얻어오기</h3>
<%
	java.util.Enumeration<String> names = session.getAttributeNames();
	// attribute 의 key들을 추출
	while (names.hasMoreElements()){
		String name = names.nextElement().toString();		// 키값을 하나씩 꺼낸다
		String value = session.getAttribute(name).toString();		// value 값 추출
		out.println("<h3>key : " + name + " - value : " + value + "</h3>");		// 출력
	}
%>
</h3>
</body>
</html>