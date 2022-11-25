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
				<div onclick="move(10);">나는 Js를 통한 get 방식 요청이야</div>
			</td>
		</tr>
		<tr>
			<td>
				<input name="a" placeholder="숫자만">
			</td>
			<td>
				<button>나는 버튼이야</button>
			</td>
		</tr>
		<tr>
			<td>
				<a href="SController?a=10">나는 a 태그야</a>
			</td>
		</tr>
	</table>
</form>	
</body>
</html>