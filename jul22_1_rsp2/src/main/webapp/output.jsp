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
				���
			</td>
		</tr>
		<tr align="center">
			<td>
				�ϲ�<br>
				<img src="picture/${userHand }.png">
			</td>
			<td>
				����<br>	
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
				���� ���ھ� : ��:${score.victory } ��:${score.draw } ��:${score.lose }
			</td>
		</tr>
		<tr>
			<td colspan="3">
				�̹��� �� ����?
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
				���� �� �� �~?
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