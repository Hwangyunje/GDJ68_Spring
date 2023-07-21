<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
	<h1> 학생목록</h1>
	<table>
		<thead>
			<th>학생번호</th>
			<th>학생이름</th>
		</thead>
		<tbody>
			<c:forEach items="${list}">
				<tr>
					<td>
						<a href="./detail?studentNum="${d.studentNum}>${d.studentName}</a></td>
				</tr>
			
			</c:forEach>
		</tbody>
	</table>
	
	</section>


</body>
</html>