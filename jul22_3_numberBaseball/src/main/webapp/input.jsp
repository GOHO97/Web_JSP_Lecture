<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="hoValidChecker.js"></script>
<script type="text/javascript" src="crossNum.js"></script>

</head>
<body>
	<form action="GameController" name="f" onsubmit="return check();">
		<table>
			<tr>
				<th>
					숫자 야구!	
				</th>
			</tr>
			<tr>
				<td>
					도전 횟수:${gameCount }<br>
					B:${ball }<br>
					S:${strike }<br>
					${result }<br>
					${again } 
				</td>
			</tr>
			<tr>
				<td>
					<input name="no" maxlength="3" placeholder="3자리를 입력해주세요"><br>
					<button>확인</button>
				</td>
			</tr>
			<tr>
				<td>
					룰 설명<br>
					중복된 숫자는 입력이 불가합니다<br>
					숫자가 답에 있고 자리까지 맞으면 스트라이크<br>
					숫자가 답에 있긴 한데 자리가 다르면 볼<br>
					숫자 3개가 전부 있고 자리까지 맞으면 삼진!
				</td>
			</tr>
		</table>
	</form>
</body>
</html>