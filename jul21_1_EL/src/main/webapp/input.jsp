<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="inputChecker.js"></script>
<script type="text/javascript" src="hoValidChecker.js"></script>
</head>
<body>
	<form action="MainController" method="post" enctype="multipart/form-data" name="f" onsubmit="return check();">
		<table>
			<tr>
				<th colspan="2">�ϱ���</th>
			</tr>
			<tr>
				<td colspan="2">
					${today }
				</td>
			</tr>
			<tr>
				<td>
					�׸�				
				</td>
				<td>
					<input type="file" name="img">
				</td>
			</tr>
			<tr>
				<td>
					����
				</td>
				<td>
					<textarea name="text"></textarea>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<button>����</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>