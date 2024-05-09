<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_SessionInfo.jsp</title>
</head>
<body>
<%
	String id_str = session.getId();		//현재 세션의 고유 아이디 (고유코드 生)를 얻음
	out.println("<h2>sessionid : " + id_str + "</h2>");
	
	long createdtime = session.getCreationTime();		// 생성시간 (밀리초)
	long lasttime = session.getLastAccessedTime();	// 마지막 접근 시간 (밀리초)
	
	// 사이트에 머무른 시간
	long time_used = (lasttime - createdtime) / 1000;	// 초 단위
	
	session.setMaxInactiveInterval(3600);		// 세션의 수명 (초 단위)
	int inactive = session.getMaxInactiveInterval() / 60;
	// 현재 수명을 추출하여 분 단위로 변환
	
	boolean b_new = session.isNew();		// 최초 생성 상태 여부
%>
[1] 세션 ID : [<%=id_str %>] <br><br>
[2] 웹 사이트에 머무른 시간 : <%=time_used %>초	<br><br>
[3] 세션의 유효 기간 : <%=inactive %>분 <br><br>
[4] 세션이 새로 만들어졌는교? <br>
<%
	if(b_new)out.print("넹 새로 만들었져염");
	else out.print("안 만들었는데예");
%>
</body>
</html>