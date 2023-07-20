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
	<h1>Add page</h1>
 <c:import url="./temp/header.jsp"></c:import> 
	<form action="./add" method="post">
		상품명<input class="form-control form-control-lg text-bg-secondary p-3" type="text" placeholder=".form-control-lg" type="text"name="bookName"><br>
		이자율<input class="form-control form-control-lg text-bg-secondary p-3" type="text" placeholder=".form-control-lg" type="text"name="bookRate"><br>
		
		<p>
			판매가능 <input type="radio" value="1" checked name="bookSale" class="text-bg-success p-3"><br>
			판매중지 <input type="radio" value="0" name="bookSale" class="text-bg-danger p-3"><br>
		</p>
			축구 <input type="checkbox" value="football" checked name="sports" class="text-bg-success p-3"><br>
			농구 <input type="checkbox" value="basket" name="spots" class="text-bg-danger p-3"><br>
		    야구 <input type="checkbox" value="baseball" checked name="sports" class="text-bg-success p-3"><br>
			배구 <input type="checkbox" value="volly" name="spots" class="text-bg-danger p-3"><br>
		
		<p>
<!-- 	<select name="bookSale">
		<option value="1">판매가능</option>
		<option value="2" selected>판매중지</option>
		</select> -->
	</p>
	
		<button type="button">등록</button>
		<input type="submit" value="ADD">
		<input type="reset" value="ADD">
		<input type="button" value="ADD">	
	</form>

</body>
</html>