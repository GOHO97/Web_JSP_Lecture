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
			<th>
				안녕 나는 secondV이고 니가 가져온 값들은 아래와 같아.
			</th>
		</tr>
		<tr>
			<td>
				${param.a }
				${fVVlue }
			</td>
		</tr>
		<tr>
			<td>
				<a href="ThirdController">thirdV로</a>
			</td>
		</tr>
	</table>
</body>
</html>