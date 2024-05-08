<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>082_loginOK.jsp</title>
</head>
<body>

<h1>
<%=request.getAttribute("name") %>(<%=request.getParameter("id") %>) 님 로그인 완료.
</h1>
<h1> 어서오이소 <%=request.getAttribute("name") %>님</h1>
</body>
</html>