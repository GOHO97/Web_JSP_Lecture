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
					���� �߱�!	
				</th>
			</tr>
			<tr>
				<td>
					���� Ƚ��:${gameCount }<br>
					B:${ball }<br>
					S:${strike }<br>
					${result }<br>
					${again } 
				</td>
			</tr>
			<tr>
				<td>
					<input name="no" maxlength="3" placeholder="3�ڸ��� �Է����ּ���"><br>
					<button>Ȯ��</button>
				</td>
			</tr>
			<tr>
				<td>
					�� ����<br>
					�ߺ��� ���ڴ� �Է��� �Ұ��մϴ�<br>
					���ڰ� �信 �ְ� �ڸ����� ������ ��Ʈ����ũ<br>
					���ڰ� �信 �ֱ� �ѵ� �ڸ��� �ٸ��� ��<br>
					���� 3���� ���� �ְ� �ڸ����� ������ ����!
				</td>
			</tr>
		</table>
	</form>
</body>
</html>