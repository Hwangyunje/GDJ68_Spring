<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>My Page</h1>
	
	<div>
	<p>
		<img alt="" src="../resources/upload/member/${member.memberFIleDTO.fileName}">
	</p>
	<p>
		${member.id}:${sessionScope.member.name}
	</p>
	<p>
		${member.email}
	</p>
	<p>
		${member.birth}
	</p>
	</div>
	
	<a class="btn-primary" href="./memberUpdate">회원수정</a>
	
</body>
</html>