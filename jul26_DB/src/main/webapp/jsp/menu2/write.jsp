<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="WController" method="post" name="bWriteF" onsubmit="return writeCheck();">
		<table id="writeTable">
			<tr>
				<td align="center">
					<input name="title" placeholder="���� 20�� ����" maxlength="20" autofocus="autofocus" autocomplete="off">
				</td>
			</tr>
			<tr>
				<td align="center">
					<textarea name="txt" placeholder="���� 200�� ����" autocomplete="off"></textarea> 
				</td>
			</tr>
			<tr>
				<td align="center">
					<button>���</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>