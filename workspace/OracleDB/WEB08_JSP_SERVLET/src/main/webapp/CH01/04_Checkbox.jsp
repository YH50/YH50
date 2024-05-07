<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>04_Checkbox.jsp</title>
</head>
<body>
	<h2>액세서리</h2>
	마음에 드는 브랜드를 선택하이소.
	<hr>
	<form method = "get" action = "04_Checkbox_to.jsp">
		<input type = "checkbox" name = "item" value = "shoes"> Balenciaga
		<input type = "checkbox" name = "item" value = "bag"> Louis Vuitton
		<input type = "checkbox" name = "item" value = "belt"> Gucci
		<br>
		<input type = "checkbox" name = "item" value = "cap"> Verutum
		<input type = "checkbox" name = "item" value = "watch"> Breitling
		<input type = "checkbox" name = "item" value = "diamond">Chanel<br>
		<hr>
		<input type = "radio" name = "gender" value = "M"> 남성
		<input type = "radio" name = "gender" value = "F"> 여성
		<input type = "submit" value = "전송">
	</form>
</body>
</html>