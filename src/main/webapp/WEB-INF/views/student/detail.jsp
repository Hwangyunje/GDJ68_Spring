<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <c:import url="./temp/bootStrap.jsp"></c:import>
</head>
<body>

 <c:import url="./temp/header.jsp"></c:import> 
	<h1 class="text-bg-info p-3">Detail Page</h1>

	<!-- getter 이름:메서드에서 get을 제외하고 첫번째글자를 소문자로 바꾼것 -->
	<h1>${requestScope.dto.StudentName}</h1>
	<h1>${dto.studentnum} </h1>
	
	<h1>${dto.kor}</h1>
	<h1>${dto.eng}</h1>
	<h1>${dto.math}</h1>
	<h1>${dto.total}</h1>
	<h1>${dto.avg}</h1>
</body>
</html>