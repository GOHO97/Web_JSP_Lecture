<%@page import="com.ho.jul0721.mvc.DiaryContent"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<th colspan="2">일기장</th>
			</tr>
			<tr>
				<td>
					${dc.today}
				</td>
				<td>
					<img src="${dc.icon}">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<img src="file/${dc.img}">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					${dc.text }
				</td>
			</tr>
			
		</table>
</body>
</html>