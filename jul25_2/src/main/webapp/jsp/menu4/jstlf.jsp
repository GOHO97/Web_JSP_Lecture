<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>����</h1>
	${a }<hr>
	<fmt:formatNumber value="${a }" type="number"/><hr>
	<fmt:formatNumber value="${a }" type="currency" currencySymbol="\\"/><hr>
	<fmt:formatNumber value="${b }" type="percent"/><hr>
	<fmt:formatNumber value="${b }" pattern="#.000"/><hr>
	
	<fmt:formatDate value="${c }" type="date" dateStyle="long"/><hr>
	<fmt:formatDate value="${c }" type="date" dateStyle="short"/><hr>
	
	<fmt:formatDate value="${c }" type="time" timeStyle="short"/><hr>
	<fmt:formatDate value="${c }" type="time" timeStyle="long"/><hr>
	<fmt:formatDate value="${c }" type="both" dateStyle="long" timeStyle="short"/><hr>
	<fmt:formatDate value="${c }" type="time" timeStyle="short"/><hr>
	
	<table border="1">
		<tr>
			<th>�����̸�</th><th>����</th><th>�������</th>
		</tr>
		<c:forEach var="s" items="${snacks }">
			<tr>
				<td align="center">
					 ${s.name }
				</td>
				<td align="center">
					<fmt:formatNumber value="${s.price }" type="number"/>��
				</td>
				<td align="center">
					<fmt:formatDate value="${s.exp }" type="date" dateStyle="long"/>
				</td>
			</tr>
		</c:forEach>
	</table>
	<hr>
	<c:if test="${fn:contains(s, '��') }">
		��
	</c:if>
	<c:if test="${fn:length(s) >= 2 }">
		2�� �̻�
	</c:if>
	
</body>
</html>