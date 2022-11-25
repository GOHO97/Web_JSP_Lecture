<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		int hab = (Integer) request.getAttribute("hab");
	%>
	<h1><%=a %> + <%=b %> = <%=hab %></h1>
	
</body>
</html>