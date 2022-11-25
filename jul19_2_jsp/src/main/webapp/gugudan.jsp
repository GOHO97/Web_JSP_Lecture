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
			String d = request.getParameter("dan");
			int dan = Integer.parseInt(d);
		%>
	<table border="1">
			<tr>	
				<th>
					<%=dan %>단
				</th>
			</tr>		
		<%
			for (int j = 1; j < 10; j++) {
		%>
			<tr>
				<td>
					<%=dan%> X <%=j%> = <%=dan * j%>
				</td>
			</tr>		
		<%
			}
		%>				
	</table>
</body>
</html>