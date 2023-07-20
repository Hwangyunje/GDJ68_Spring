<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
         	<!--   header  -->
     	<header>
     		<nav class="navbar navbar-expand-lg bg-dark border-bottom border-bottom-dark" data-bs-theme="dark">
					     		 <div class="container-fluid">
				    <a class="navbar-brand" href="#">Navbar</a>
				    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				      <span class="navbar-toggler-icon"></span>
				    </button>
				    <div class="collapse navbar-collapse" id="navbarSupportedContent">
				      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
				        <li class="nav-item">
				          <a class="nav-link active" aria-current="page" href="#">Home</a>
				        </li>
				        <li class="nav-item">
				          <a class="nav-link" href="/bankbook/list.do">금융상품</a>
				        </li>
				        <li class="nav-item dropdown">
				          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				            Dropdown
				          </a>
				          <ul class="dropdown-menu">
				            <li><a class="dropdown-item" href="#">Action</a></li>
				            <li><a class="dropdown-item" href="#">Another action</a></li>
				            <li><hr class="dropdown-divider"></li>
				            <li><a class="dropdown-item" href="#">Something else here</a></li>
				          </ul>
				        </li>
				        <li class="nav-item">
				          <a class="nav-link disabled">Disabled</a>
				        </li>
				      </ul>
				      
				      <c:if test="${empty member}">
				      <nav>
				       	<ul class="nav">
				       		<li class="nav-item text-white me-3" type="button"value="Input"><a href="/member/login.do">로그인</li></a>
				       		<li class="nav-item text-white me-3" type="button"value="Input"><a href="/member/join.do">회원가입</li></a>
				       	</ul>
				      </nav>
				      </c:if>
				      <c:if test="${sessionScope.member ne null}">
				      <nav>
				       	<ul class="nav">
				       		<li class="nav-item text-white me-3" type="button"value="Input"><a href="/member/logout.do">로그아웃</li></a>
				       		<li class="nav-item text-white me-3" type="button"value="Input"><a href="/member/mypage.do">mypage</li></a>
				       	</ul>
				      </nav>
				      
				      
				      </c:if>
				     <!--   <form class="d-flex" role="search">
				        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
				        <button class="btn btn-outline-success" type="submit">Search</button>
				      </form>-->
				    </div>
				  </div>>	
     		</nav>
     	</header>
    