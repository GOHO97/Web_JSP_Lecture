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
			<c:forEach var="b" items="${balls }">
				<td>
					<img src="lotto/${b }">
				</td>			
			</c:forEach>
		</tr>
	</table>
</body>
</html>