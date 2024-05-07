<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_Select_to.jsp</title>
</head>
<body>
<%
	String job = request.getParameter("job");
	String [] interests = request.getParameterValues("interest");
%>

	<h1>당신이 선택한 직업 : <%=job %></h1>
	<br><br><br>
	
	<h1>당신이 선택한 팀</h1>
	<h1>
		<%
			if( interests == null)
				out.print("아무것도 안 골랐는데예");
			else{
				for( String interest : interests){
					out.print(interest + "<br>");
				}
			}
		%>
	</h1>
	
</body>
</html>