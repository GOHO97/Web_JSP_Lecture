<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/Calculator.css">

<%!
public String result(double r){
	return (r % 2 == 0) ? "zzack" : "holl";
}
%>
</head>
<body>
<%
double x = Double.parseDouble(request.getParameter("x"));
double y = Double.parseDouble(request.getParameter("y"));

double a = x+y;
double b = x-y;

RequestDispatcher rd = request.getRequestDispatcher("third.jsp");
request.setAttribute("aaa", a);
request.setAttribute("bbb", b);
rd.forward(request, response);

%>
<table>
	<tr>
		<td class="<%=result(a) %>"><%=x %> + <%=y %> = <%=String.format("%.1f", a) %></td>
	</tr>
	<tr>
		<td class="<%=result(b) %>"><%=x %> - <%=y %> = <%=String.format("%.1f", b) %></td>
	</tr>
	<tr>
		<td class="<%=result(x*y) %>"><%=x %> * <%=y %> = <%=String.format("%.1f", x*y) %></td>
	</tr>
	<tr>
		<td class="<%=result(x/y) %>"><%=x %> / <%=y %> = <%=String.format("%.1f", x/y) %></td>
	</tr>
	
	<%
//		RequestDispatcher rd = request.getRequestDispatcher("third.jsp");
	//	rd.include(request, response);
	%>
</table>
	
</body>
</html>