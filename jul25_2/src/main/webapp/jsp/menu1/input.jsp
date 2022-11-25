<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="Menu1Controller" method="post" name="calcForm" onsubmit="return calcCheck();">
		<input name="x" class="calcInput" placeholder="x">랑
		<input name="y" class="calcInput" placeholder="y">
		<button id="calcBtn">계산</button>
	</form>
</body>
</html>