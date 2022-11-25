<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/hoValidChecker.js"></script>
<script type="text/javascript" src="js/joinValidCheker.js"></script>
<link rel="stylesheet" href="css/login.css">
</head>
<body id="joinBody">
	<form action="JoinController" method="post" name="joinF" onsubmit="return joinCheck();" enctype="multipart/form-data">
		<table id="joinTable">
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="photo" type="file">
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3">
					������ ����(img, jpg, png�� ����)
				</td>
			</tr>
			<tr >
				<td colspan="3">
					���̵�
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="id" autocomplete="off" maxlength="15" autofocus="autofocus" placeholder="�ѱ�, Ư������ ����">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					��й�ȣ
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput"> 
					<input name="pw" type="password" autocomplete="off" maxlength="15" placeholder="�ѱ� ���� Ư�����ڴ� !@#$%^�� ����">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					��й�ȣ ��Ȯ��
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="pw2" type="password" autocomplete="off" maxlength="15">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					�г���
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="name" autocomplete="off" maxlength="10">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					����
				</td>
			</tr>
			<tr>
				<td align="center">
					<select name="y">
						<c:forEach var="yy" begin="${curYear - 60 }" end="${curYear }">
							<option>${yy }</option>
						</c:forEach>
					</select>��
				</td>
				<td align="center">
					<select name="m">
						<c:forEach var="mm" begin="1" end="12">
							<option>${mm }</option>
						</c:forEach>
					</select>��
				</td>
				<td align="center">
					<select name="d">
						<c:forEach var="dd" begin="1" end="31">
							<option>${dd }</option>
						</c:forEach>
					</select>��
				</td>
			</tr>
			<tr>
				<td colspan="3">
					E-mail
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="email" type="email" autocomplete="off">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					�ּ�
				</td>
			</tr>
			<tr>
				<td align="center" class="addrInput">
					<input name="addr1" autocomplete="off" placeholder="�����ȣ">
				</td>
				<td align="center" class="addrInput">
					<input name="addr2" autocomplete="off" placeholder="�ּ�">
				</td>
				<td align="center" class="addrInput">
					<input name="addr3" autocomplete="off" placeholder="���ּ�">
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3">
					<button>ȸ������</button>
				</td>			
			</tr>
		</table>
	</form>
</body>
</html>