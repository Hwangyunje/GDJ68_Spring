<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- <div style="display: none;">${pager.totalPgae}</div> -->
<c:forEach items=${comentList}" var="com" varStatus="i">
	<c:choose>
		<c:when test="${i.first}">
			<tr id="totalPage" data-totalPage="${pager.totalPgae}">	
		</c:when>
		<c:otherwisie>
			<tr>
		</c:otherwisie>
	</c:choose>
		<td>${com.commentContents}</td>
		<td>${com.id}</td>
		<td>${com.commentDate}</td>
	</tr>
</c:forEach>	