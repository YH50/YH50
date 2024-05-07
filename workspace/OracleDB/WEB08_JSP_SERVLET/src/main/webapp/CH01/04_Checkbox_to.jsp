<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_Checkbox_to.jsp</title>
</head>
<body>
	<h2>04_Checkbox_to.jsp 입니다.</h2>
<%
	//String item = request.getParameter("item");
	String [] item = request.getParameterValues("item");
	String gender = request.getParameter("gender");
	if( item == null){
		out.print("<h3>선택한 항목이 없는데예</h3>");
	}else{
		out.print("<h3>선택한 항목은 다음과 같십니데이.</h3>");
	for (String t : item){
		out.print("<h3>" + t + "</h3>");
		}
	}
%>
	
	%>
	<%-- 선택한 아이템 : <%=item %><br/>--%>
	<!-- 이러면 결과창엔 맨 처음 선택한 값만 출력되기 때문에 이렇게 쓰면 안됨 -->
	성별 : <%=gender %>
	
</body>
</html>