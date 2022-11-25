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
			<td>
				a : ${param.a } <br>
				b : ${fVVlue } <br>
				c : ${sessionScope.c } <br>
				d : ${cookie.d.value }
			</td>
		</tr>
	</table>
</body>
</html>