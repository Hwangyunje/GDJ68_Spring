<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<section class="container mt-5">
	<h1 class="my-4">Add Page</h1>
	
	<form action="./add" method="post">
		<div class="mb-3">
		  <label for="studentName" class="form-label">학생이름</label>
		  <input type="text" name="studentName" class="form-control" id="studentName" placeholder="학생이름">
		</div>
		<div class="mb-3">
		  <label for="studentNum" class="form-label">학생번호</label>
		  <textarea class="form-control" name="studentNum" id="studentNum" rows="3"></textarea>
		</div>	
		<div class="mb-3">
		  <label for="kor" class="form-label">국어점수</label>
		    <input type="text" name="kor" class="form-control" id="kor" placeholder="국어점수">
		</div>
		<div class="form-check">
		  <input for="eng" class="form-input" name="eng"  id="eng" placeholder="영어점수">
		  <label class="form-label" for="eng">영어점수</label>
		</div>
				<div class="form-check">
		  <input for="math" class="form-input" name="math"  id="math" placeholder="수학점수">
		  <label class="form-label" for="math">수학점수</label>
		</div>
		<div class="my-3">
			<button type="submit" class="btn btn-danger">학생정보등록</button>
		</div>

	</form>
	</section>
</body>
</html>