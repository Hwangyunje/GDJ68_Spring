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
		<input type="hidden" name="Board" value="${dto.num}">
		작성자<input type="text" name="name" value="${dto.name}"><br>
		내용 <textarea rows="" cols="" name="contents">${dto.contents}</textarea>
		제목<input type="text" name="subject" value="${dto.subject}"><br>
		<c:forEach items="${dto.dtos}" var="f">
		<div class="input-group mb-3">
			<input type="file" value="${dto.originalName}" class="form-control" id="photos" name="photos">
		</div>
		</c:forEach>
		
		<button type="submit">수정</button>
		
	</form>
</body>
</html>