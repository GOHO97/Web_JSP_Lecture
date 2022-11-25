<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table id="boardArea">
		<tr>
			<td align="right" colspan="3">
				<a href="WController">글쓰기</a>
			</td>
		</tr>
		<tr class="BAContent">
			<th>번호</th><th>제목</th><th>날짜</th>
		</tr>
		
		<c:forEach var="i" items="${boardData }">
			<tr class="BAContent" onclick="goBoardContentPage(${i.b_no });">
				<td align="center" class=BANumTd>
					${i.b_no }
				</td>
				<td align="center" class=BATitleTd>
					${i.b_title }
				</td>
				<td align="center" class=BADateTd>
					${i.b_when }
				</td>
		</tr>
		</c:forEach>
		<tr>
			<td colspan="3" align="center">
				<c:forEach var="p" begin="1" end="${pageCount }">
					&nbsp;<a href="M2Controller?pageNum=${p }">${p }</a>&nbsp;
				</c:forEach>
			</td>
		</tr>
		<tr>
			<td colspan="3" align="center">
				검색
			</td>
		</tr>
	</table>
</body>
</html>