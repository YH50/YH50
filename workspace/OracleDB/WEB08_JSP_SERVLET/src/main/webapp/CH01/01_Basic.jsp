<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>안녕하세요</h2>
	<h2>Java Server Page (JSP)</h2>
	
	<!-- 
	JSP 는 Java Server Page 의 약자로, 웹 페이지 내부에 프로그래밍 적인 요소를 추가하거나
	서버에서 계산되고 실행된 결과를 웹 페이지에서 표시하고 싶을 때 사용함.
	>> 웹페이지 HTML5 중간에 자바 프로그래밍 코드를 같이 쓰겠다는 뜻과 유사함.
	예시) 날짜 변수 d 의 선언과 동시에 객체 초기화 동작
	 -->
	 <script type="text/javascript">
	 	// 자바스크립트 명령 작성칸 - 브라우저에 내장되어 있는 자바스크립트 실행 프로그램이 실행됨 @클라이언트
	 	alert("자바스크립트에서 실행됨");
	 </script>
	 
	 <%
	 	//JSP 명령 작성칸
	 	// 서버에서 자바프로그래밍 실행기가 실행됨, 서버에서 실행
	 	java.util.Date d = new java.util.Date();
	 %>
	 <h2>현재 시간 : <%=d %></h2>
	 
	 <!-- HTML 로 페이지를 구성하는 중, JSP 에 의한 컨텐츠가 도중에 나와야 한다면 필요한 곳에 JSP 명령 기입 -->
	 <!-- 현재 JSP 파일 내에 html 문법 사이로 jsp 문법이 끼어서 코딩될 때는 <%%>를 사용 -->
	 
	 <!-- JSP 명령 사용법 -->
	 <%-- HTML 내에서 JSP 명령이 섞인 구문을 주석처리 해주는 기호 --%>
	 
	 <%-- 
	 	<% jsp 명령 %> : 명령의 실행
	  --%>
	  	 <%-- 
	 	<%= 변수 or 출력 내용 %> : 웹 페이지에 출력
	  --%>
	  
	  <!-- jsp 명령은 html 태그와 함께 파일로 저장되어 서버에 보관됨.
	  		클라이언트의 요청을 받으면 해당 파일(~.jsp)이 클라이언트로 전송되어 웹브라우저에 표시가 되는데
	  		그 전에 jsp 명령은 이미 실행되어 결과만 html 태그와 같이 전송됨.	
	    -->
</body>
</html>