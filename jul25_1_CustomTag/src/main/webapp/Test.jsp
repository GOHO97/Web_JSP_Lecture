<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Test1</h1>
<table border="1">
	<tr>
		<td>
			<%	
			//	request.getRequestDispatcher("test2.jsp").include(request, response);
			%>
			<jsp:include page="Test2.jsp"></jsp:include>
		</td>
	</tr>
</table>
</body>
</html>