<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript">
function move(a) {
	location.href="SController?a=" + a;
}
</script>
</head>
<body>
<form action="SController" name="firstF">
	<table>
		<tr>
			<td>
				<div onclick="move(10);">���� Js�� ���� get ��� ��û�̾�</div>
			</td>
		</tr>
		<tr>
			<td>
				<input name="a" placeholder="���ڸ�">
			</td>
			<td>
				<button>���� ��ư�̾�</button>
			</td>
		</tr>
		<tr>
			<td>
				<a href="SController?a=10">���� a �±׾�</a>
			</td>
		</tr>
	</table>
</form>	
</body>
</html>