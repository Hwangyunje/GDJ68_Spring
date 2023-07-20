
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
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
	<h1>${requestScope.dto.BookName}</h1>
	<h1>${dto.bookRate} </h1>
	
	<c:choose>
		<c:when test="${dto.bookSale eq 1} }">
			<h1 class="text-bg-success p-3">판매중</h1>
		</c:when>
		<c:otherwise>
			<h1 class="text-bg-danger p-3">판매종료</h1>
		</c:otherwise>
	</c:choose>
	
	<%--
	 <c:if test="${dto.bookSale eq 1}">
	<h1>판매중</h1>
	</c:if>
	<c:if test="${dto.bookSale eq o}>">
	<h1>판매종료</h1>
	</c:if> 
	--%>
</body>
</html>