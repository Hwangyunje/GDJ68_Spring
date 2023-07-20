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
	 <form action=". /member/join.do"method="post">
  <div class="mb-3">
    <label for="id" class="form-label">ID</label>
    <input type="text" name="id" class="form-control" id="id" placeholder="id를 입력하세요">
  </div>
 
   <div class="mb-3">
    <label for="pw" class="form-label">PW</label>
    <input type="password" name="pw" class="form-control" id="pw">
  </div>
  
  <div>
  <button type="submit" class="btn btn-primary">로그인</button>
	</div>
</form>
</section>
	
</body>
</html>