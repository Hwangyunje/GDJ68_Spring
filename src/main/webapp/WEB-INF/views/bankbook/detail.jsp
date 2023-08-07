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
	<h1>Detail Page</h1>
	
	<%-- ${} --%>
	<!-- Getter 이름 : 메서드에서 get을 제외하고 첫번째글자를 소문자로 바꾼것 -->
	<h1>${requestScope.dto.bookName}</h1>
	
	<div>
		${dto.bookContents}
	</div>
	
	<h1>${dto.bookRate} </h1>
	
	<c:choose>
		<c:when test="${dto.bookSale eq 1}">
			<h1>판매중</h1>
		</c:when>
		<c:otherwise>
			<h1>판매종료</h1>
		</c:otherwise>
	</c:choose>
	
	<c:forEach items="${dto.fileDTOs}" var="f">
		<img alt="" src="/resources/upload/bankbook/${f.fileName}">
	</c:forEach>
	
	<a href="./update?bookNum=${dto.bookNum}">수정</a>
	<a href="./delete?bookNum=${dto.bookNum}">삭제</a>
	<button id="update">수정</button>
	<button id="del" data-delete-name="bookNum" data-delete-num="${dto.bookNum}">삭제</button>
	<a class="btn btn-primary" href="../bookAccount/add?bookNum=${dto.bookNum}" data-bs-toggle="modal" data-bs-target="#accountModal">상품가입</a>
	<div class="modal fade" id="accountModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
		  <div class="modal-content">
			<div class="modal-header">
			  <h1 class="modal-title fs-5" id="exampleModalLabel">비밀번호를 입력</h1>
			  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			</div>
			<div class="modal-body">
			  <div class="mb-3">
		  <input type="password" name="accountPassword" class="form-control" id="pw"  placeholder="PW를 입력하세요">
				</div>
		</div>
			<div class="modal-footer">
			  <button type="button" class="btn btn-secondary" data-bs-dismiss="modal" id="close">Close</button>
			  <button type="button" class="btn btn-primary" data-add-num="${dto.bookNum}">상품가입</button>
			</div>
		  </div>
		</div>
	  </div>

	<%-- 	
	<c:if test="${dto.bookSale eq 1}">
		<h1>판매중</h1>
	</c:if>
	<c:if test="${dto.bookSale eq 0}">
		<h1>판매종료</h1>
	</c:if>
--%>

	<script src="../resources/js/delete.js"></script>
	<!-- <script>
		setBookNum(${dto.bookNum});
	</script> -->
	<script type="text/javascript">
		const add=document.getElementById("add");

		 add.addEventListener("click",function(){
			let bookNum=add.getElementById("adta-add-num");
			let pw =document.getElementById("pw").value;
			// ajax1(bookNum,pw);
			ajax2(bookNum,pw);
		});
		//최신버전
	function ajax2(bookNum,pw){
		fetch("../bookAccount/add", {
			method:"post",
			body:"bookNum="+bookNUm+"&accountPassword="+pw,
			headers:{
				"Content-type": "application/x-www-form-urlencoded"
			}
		})
		.then((response)=>{
			return response.text();
		})
		.then((r)=>{
			if(r>0){
				alert("가입완료");
			}else{
				alert("가입실패");
			}
			location.href="../"
		})
		;
	}


		//java내장코드
		function ajax1(bookNum,pw){}
		//1.
		let xhttp= new XMLHttpRequest();

	//2.요청정보
	xhttp.open("post","../bookAccount/add");


	//요청 header 정보
	xhttp.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	//요청발생(post일 경우 파라미터작성 key=값&key2=값2)
	xhttp.send("bookNum="+bookNum+"&accountPassword="+pw);

	//응답처리
	xhttp.onreadystatechange=function(){
	if(this.readyState==4 &&this.status==200){
		let r= this.responseText.trim();
		console.log(r);
		if(r>0){
			alert("가입성공");
		}else{
			alert("가입실패");
		}
		
	document.getElementById("close").click();

	location.href="../";

	}
}


	</script>
</body>
</html>