<%@page import="com.ho.jul20.MVCp.Guest"%>
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
		Guest g = (Guest) request.getAttribute("ggggg");
	%>
	<table>
			<tr>
				<th colspan="2">
					비만도 검사	결과			
				</th>
			</tr>
			<tr>
				<td>
					이름
				</td>
				<td>
					<%=g.getName() %>
				</td>
			</tr>
			<tr>
				<td>
					키
				</td>
				<td>
					<%=g.getHeight() %>
				</td>
			</tr>
			<tr>
				<td>
					몸무게
				</td>
				<td>
				<%=g.getWeight() %>
				</td>
			</tr>
			<tr>
				<td>
					BMI
				</td>
				<td>
				<%=String.format("%.1f", g.getBmi()) %>
				</td>
			</tr>
			<tr>
				<td>
					결과
				</td>
				<td>
				<%=g.getName() %>님은 <%=g.getStatus() %>입니다.
				</td>
			</tr>
		</table>
</body>
</html>