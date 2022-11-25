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
			<td colspan="3">
				결과
			</td>
		</tr>
		<tr align="center">
			<td>
				니꺼<br>
				<img src="picture/${userHand }.png">
			</td>
			<td>
				내꺼<br>	
				<img src="picture/${comHand }.png">
			</td>
		</tr>
		<tr>
			<td colspan="3">
				${judge }
			</td>
		</tr>
		<tr>
			<td colspan="3">
				누적 스코어 : 승:${score.victory } 무:${score.draw } 패:${score.lose }
			</td>
		</tr>
		<tr>
			<td colspan="3">
				이번엔 뭐 낼래?
			</td>
		</tr>
		<tr>
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
			<td colspan="3">
				나는 뭘 낼 까나~?
			</td>
		</tr>
		<tr>
			<td colspan="3">
				<img src="picture/start.gif">
			</td>
		</tr>
	</table>
</body>
</html>