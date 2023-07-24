<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

 <c:import url="./temp/bootStrap.jsp"></c:import>
</head>
<body>
<section>
	<h1 class="text-bg-dark p-3">join Page</h1>
	 <c:import url="./temp/header.jsp"></c:import> 
	 <form action=". /memberUpdate"method="post">

 
   <div class="mb-3">
    <label for="pw" class="form-label">PW</label>
    <input type="passwor" value="${member.pw} }" name="pw" class="form-control" id="pw">
  </div>
  
    <div class="mb-3">
    <label for="name" class="form-label">이름</label>
    <input type="text" value="${member.name}" name="name" class="form-control" id="name" placeholder="name를 입력하세요">
  </div>
  
    <div class="mb-3">
    <label for="email" class="form-label">Email</label>
    <input type="email" value="${member.email} }" name="email" class="form-control" id="email" placeholder="email를 입력하세요">
  </div>
  
   <div class="mb-3">
    <label for="birth" class="form-label">Birth</label>
    <input type="date" value="${member.birth} name="birth" class="form-control" id="birth" placeholder="생년월일을 입력하세요">
  </div>
  <div>
  <button type="submit" class="btn btn-primary">회원수정</button>
	</div>
</form>
</section>
	
</body>
</html>