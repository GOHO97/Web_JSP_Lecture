<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="reWriteF" action="ReWController" method="post" onsubmit="reWriteCheck">
	<table id="reWriteTable">
		<tr>
			<td align="center">
				�� ��ȣ : <input name="no" value="${bd.b_no }" readonly="readonly">
			</td>
			<td align="center">
				�� ���� : <input name="title" maxlength="20" value="${bd.b_title }">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right" id="tableTd">
				${bd.b_when }
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<textarea name="bContent" maxlength="200" autocomplete="off" placeholder="����">${bd.b_content }</textarea>
			</td>
		</tr>
		<tr>
			<td align="center">
				<button>����</button>
			</td>
			<td align="center">
				<table>
				<tr>
					<td id="deleteTd" align="center">
						<div onclick="reWriteDelete(${bd.b_no});">����</div>
					</td>
				</tr>
				</table>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>