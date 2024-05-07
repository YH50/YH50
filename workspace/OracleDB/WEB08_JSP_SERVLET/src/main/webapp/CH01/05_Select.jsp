<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>05_Select.jsp</title>
</head>
<body>
	<form method = "get" action = "05_Select_to.jsp">
		<label for="job">직업</label><br>
		<select id = "job" name = "job" size = "1">
			<option value = "">골라보이소</option>
			<option value = "학생">학생</option>
			<option value = "컴퓨터/인터넷">개발자</option>
			<option value = "언론">언론</option>
			<option value = "공무원">공무원</option>
			<option value = "군인">군인</option>
			<option value = "서비스업">서비스업</option>
		</select><br><br><br>
		
		<label for="interest" style = "float:left;">응원 구단</label><br>
		<select id = "interest" name = "interest" size = "5" multiple = "multiple">
			<option value = "LG">LG 트윈스</option>
			<option value = "롯데">롯데 자이언츠</option>
			<option value = "KIA">KIA 타이거즈</option>
			<option value = "삼성">삼성 라이온즈</option>
			<option value = "한화">한화 이글스</option>
		</select><br><br><br>			
		<input type = "submit" value = "전송">
	
	</form>
</body>
</html>