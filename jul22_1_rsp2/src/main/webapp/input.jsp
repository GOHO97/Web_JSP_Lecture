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
					���������� ����
				</th>
			</tr>
			<tr>
				<td colspan="4">
					���� ���ھ� : ��:${score.victory } ��:${score.draw } ��:${score.lose }
				</td>
			</tr>
			<tr>
				<td>
					�� ����?
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
					���¾� ��ǻ��<br>
					�̰ܺ�����
				</td>
				<td colspan="2">
					<img src="picture/start.gif">
				</td>
			</tr>
		</table>
</body>
</html>