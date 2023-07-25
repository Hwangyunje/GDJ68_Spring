<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
		<input type="hidden" name="noticeNo" value="${dto.noticeNo}">
		제목<input type="text" name="noticeSubject" value="${dto.noticeSubject}"><br>
		내용 <textarea rows="" cols="" name="noticeContent">${dto.noticeContent}</textarea>
		작성자<input type="text" name="noticeName" value="${dto.noticeName}"><br>
		
		
		<button type="submit">수정</button>
		<input type="submit" value="수정">
		<input type="reset" value="수정">reset</button>
		<input type="button" value="수정">
	</form>
</body>
</html>