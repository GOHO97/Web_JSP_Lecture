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
					�񸸵� �˻�	���			
				</th>
			</tr>
			<tr>
				<td>
					�̸�
				</td>
				<td>
					<%=g.getName() %>
				</td>
			</tr>
			<tr>
				<td>
					Ű
				</td>
				<td>
					<%=g.getHeight() %>
				</td>
			</tr>
			<tr>
				<td>
					������
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
					���
				</td>
				<td>
				<%=g.getName() %>���� <%=g.getStatus() %>�Դϴ�.
				</td>
			</tr>
		</table>
</body>
</html>