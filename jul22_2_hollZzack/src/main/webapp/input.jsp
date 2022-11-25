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
				홀짝 게임
			</th>
		</tr>
		<tr>
			<td>
				${gameCount }회차 게임(총 10회)
			</td>
		</tr>
		<tr>
			<td>
				맞춰 보슈<br>
				<a href="MainController?choice=holl&count=${count }">홀</a>
				<a href="MainController?choice=zzack&count=${count }">짝</a>
			</td>
		</tr>
		<tr>
			<td>
				<img src="coin.PNG">${img }
			</td>
		</tr>
		<tr>
			<td>
				${gameCount }번 게임 결과 ${result }<br>
				누적 스코어 승:${win } 패:${lose }
			</td>
		</tr>
	</table>
</body>
</html>