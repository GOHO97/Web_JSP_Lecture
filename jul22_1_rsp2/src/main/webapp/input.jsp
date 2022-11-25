<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
			<tr>
				<th colspan="4">
					가위바위보 게임
				</th>
			</tr>
			<tr>
				<td colspan="4">
					누적 스코어 : 승:${score.victory } 무:${score.draw } 패:${score.lose }
				</td>
			</tr>
			<tr>
				<td>
					뭐 낼겨?
				</td>
				<td>
					<a href="MainController?hand=2"><img src="picture/2.png"></a>
				</td>
				<td>
					<a href="MainController?hand=1"><img src="picture/1.png"></a>
				</td>
				<td>
					<a href="MainController?hand=3"><img src="picture/3.png"></a>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					나는야 컴퓨터<br>
					이겨보시지
				</td>
				<td colspan="2">
					<img src="picture/start.gif">
				</td>
			</tr>
		</table>
</body>
</html>