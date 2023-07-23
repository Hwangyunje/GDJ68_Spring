<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ tablib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../temp/bootStrap.jsp"></c:import>
</head>
<body>
<c:import url="../temp/header.jsp"></c:import>
	<h1>Update Page</h1>
	<form action="./update" method="post">
		학생번호<input type="text" name="studentNum" value="${dto.studentNum}">
		학생이름<input type="text" name="studentName" value="${dto.studentName}"><br>
		국어점수 <input type="text" name="kor">${dto.kor}<br>
		영어점수<input type="text" name="eng" value="${dto.eng}"><br>
		수학점수<input type="text" name="math" value="${dto.math}">
		
		
		<button type="submit">수정</button>
		<input type="submit" value="수정">
		<input type="reset" value="수정">
		<input type="button" value="수정">
	</form>
</body>
</html>