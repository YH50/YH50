<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_setCookie.jsp</title>
</head>
<body>
<!--
쿠키 : 웹사이트 접속 시 접속자의 개인장치에 다운로드 되고 브라우저에 저장되는 텍스트 데이터.
웹사이트는 쿠키를 통해 접속자의 장치를 인식하고 접속자의 설정과 과거 이용내역에 대한 일부 데이터를 저장함
쿠키 > 만료일 有, 브라우저 닫을 경우 자동삭제되는 쿠키 존재, 일부는 수동 삭제 전까지 남아있음.
 -->
 
 <!-- 쿠키의 사용 
 - 필수 쿠키 : 페이지 탐색 웹사이트의 보안 영역 접속 and 검색을 포함한 웹사이트의 기본 기능의 활성화 목적으로 사용
 - 기능 쿠키 : 웹사이트가 접속자의 지역 및 언어 등
 			웹사이트의 행태 및 외관에 영향을 줄 수 있는 접속자 설정을 저장하도록 허용,
 			접속자 설정에 따라 웹사이트가 작동하도록 도움을 줌.
 - 성능 쿠키 : 정보의 익명 수집 및 보고를 통해 웹사이트 운영자가 방문자와 웹사이트 사이의
 			상호작용을 이해하는데 도움을 주며, 유저와의 상호관계의 통계자료를 제공
 			>> 웹사이트 운영자가 더욱 최적화된 웹사이트 개발에 기여함.
  -->
  
 <%
 // 1. Cookie 객체 생성
 Cookie c = new Cookie ("id", "khaerin515");
 
 // 2. Cookie 유효기간 설정
 c.setMaxAge(365*24*60*60);
 
 // 3. 클라이언트에 전송
 response.addCookie(c);
 
 // 4. new Cookie 생성하여 클라이언트에 바로 전송
 response.addCookie( new Cookie("pwd", "test1234"));
 response.addCookie( new Cookie("age","20"));
 %>
 
 <!-- 
 	서버 저장 객체 : pageContext, session, request, application
 	클라이언트 저장 객체 : Cookie
  -->
</body>
</html>