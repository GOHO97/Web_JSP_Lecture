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
				글 번호 : <input name="no" value="${bd.b_no }" readonly="readonly">
			</td>
			<td align="center">
				글 제목 : <input name="title" maxlength="20" value="${bd.b_title }">
			</td>
		</tr>
		<tr>
			<td colspan="2" align="right" id="tableTd">
				${bd.b_when }
			</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<textarea name="bContent" maxlength="200" autocomplete="off" placeholder="내용">${bd.b_content }</textarea>
			</td>
		</tr>
		<tr>
			<td align="center">
				<button>수정</button>
			</td>
			<td align="center">
				<table>
				<tr>
					<td id="deleteTd" align="center">
						<div onclick="reWriteDelete(${bd.b_no});">삭제</div>
					</td>
				</tr>
				</table>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>