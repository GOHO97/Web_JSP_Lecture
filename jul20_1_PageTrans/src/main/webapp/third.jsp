<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	<h1>공사중</h1>
	x : <%=request.getParameter("x") %><p>
	y : <%=request.getParameter("y") %><p>
	<%
		String xx = request.getParameter("x");
		double x = Integer.parseInt(xx);
		
		Object aaaa = request.getAttribute("aaa");
		Double aa = (Double) aaaa;
		double a = aa.intValue();
		
		double b = (Double) request.getAttribute("bbb");
	%>
	a: <%=a %><p>
	b: <%=b %><p>
</body>
</html>