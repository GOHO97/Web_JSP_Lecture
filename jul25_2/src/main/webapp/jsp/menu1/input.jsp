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
		<input name="x" class="calcInput" placeholder="x">��
		<input name="y" class="calcInput" placeholder="y">
		<button id="calcBtn">���</button>
	</form>
</body>
</html>