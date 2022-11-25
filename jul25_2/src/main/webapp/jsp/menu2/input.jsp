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
				홀짝 게임<br>
				${comment }
			</th>
		</tr>
		<tr>
			<td>
				${gameCount }회차 게임(총 10회)
			</td>
		</tr>
		<tr>
			<td>
				맞춰 보슈<br>
				<a href="MainController?choice=holl&count=${count }">홀</a>
				<a href="MainController?choice=zzack&count=${count }">짝</a>
			</td>
		</tr>
		<tr>
			<td>
				<img src="jsp/menu2/coin.PNG">${img }
			</td>
		</tr>
		<tr>
			<td>
				${gameCount }번 게임 결과 ${result }<br>
				누적 스코어 승:${win } 패:${lose }
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