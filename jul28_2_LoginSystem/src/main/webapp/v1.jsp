<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="MainController" method="post">
		id : <input name="id" value="${cookie.lastLoginID.value }"><br>
		pw : <input name="pw"><br>
		<button>로그인</button>
	</form>
</body>
</html>