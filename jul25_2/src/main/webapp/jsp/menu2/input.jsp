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
	<table>
		<tr>
			<th>
				Ȧ¦ ����<br>
				${comment }
			</th>
		</tr>
		<tr>
			<td>
				${gameCount }ȸ�� ����(�� 10ȸ)
			</td>
		</tr>
		<tr>
			<td>
				���� ����<br>
				<a href="MainController?choice=holl&count=${count }">Ȧ</a>
				<a href="MainController?choice=zzack&count=${count }">¦</a>
			</td>
		</tr>
		<tr>
			<td>
				<img src="jsp/menu2/coin.PNG">${img }
			</td>
		</tr>
		<tr>
			<td>
				${gameCount }�� ���� ��� ${result }<br>
				���� ���ھ� ��:${win } ��:${lose }
			</td>
		</tr>
	</table>
	<c:if test="${answer == 'holl'}"></c:if>
	<c:choose>
		<c:when test="${answer == 'holl' }">
			<h1>${answer }</h1>
		</c:when>
		<c:when test="${answer == 'zzack' }">
			<marquee>${answer } </marquee>
		</c:when>
	</c:choose>
	<c:forEach var="s" items="${al }">
		${s }<br>
	</c:forEach>
	<c:forEach var="d" items="${dogs }">
		${d.name } - ${d.age }<br>
	</c:forEach>
	<hr>
	<c:redirect url="https://www.naver.com"></c:redirect>
	
</body>
</html>