<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>92_JSP_ServletEx.jsp</title>
</head>
<body>
<%
String id = (String)request.getAttribute("id");
String pwd = (String)request.getAttribute("pwd");
String gender = (String)request.getAttribute("gender");
String content = (String)request.getAttribute("content");
String [] itemName = (String[])request.getAttribute("item");
String job = (String)request.getAttribute("job");
%>

<h1>회원정보 확인</h1><br><br>
<h3>회원님의 아이디 : <%=request.getAttribute("id") %><br>
		회원님의 성별 : <%=request.getAttribute("gender") %><br>
		회원님의 한마디 : <%=request.getAttribute("content") %><br>
		구입하신 상품 :
	<%
		for (String item : itemName)
			out.print(item + "/ ");
	%><br>
		직업 : <%=job %><br>
	</h3>
		
</body>
</html>