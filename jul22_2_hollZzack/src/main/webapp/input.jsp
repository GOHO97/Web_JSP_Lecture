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
				Ȧ¦ ����
			</th>
		</tr>
		<tr>
			<td>
				${gameCount }ȸ�� ����(�� 10ȸ)
			</td>
		</tr>
		<tr>
			<td>
				���� ����<br>
				<a href="MainController?choice=holl&count=${count }">Ȧ</a>
				<a href="MainController?choice=zzack&count=${count }">¦</a>
			</td>
		</tr>
		<tr>
			<td>
				<img src="coin.PNG">${img }
			</td>
		</tr>
		<tr>
			<td>
				${gameCount }�� ���� ��� ${result }<br>
				���� ���ھ� ��:${win } ��:${lose }
			</td>
		</tr>
	</table>
</body>
</html>