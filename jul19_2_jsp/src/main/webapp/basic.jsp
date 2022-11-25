<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<%!
	public int getCha(int x, int y ) {
		return x - y;
	}
%>
</head>
<body>
	<%
		int a = 10;
		int b = 20;
	%>
	<h1><%=a+b  %></h1>
	<h2><%=getCha(a, b) %></h2>
	<%
		if(a > 5){
	%>
			<h3><%=a %></h3>
	<% 
		} else {
	%>		
			<button><%=a %></button>	
	<%			
		}
	%>
</body>
</html>