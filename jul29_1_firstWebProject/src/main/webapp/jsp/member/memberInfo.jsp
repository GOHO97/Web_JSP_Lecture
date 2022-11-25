<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/hoValidChecker.js"></script>
<script type="text/javascript" src="js/infoModifyChecker.js"></script>
<script type="text/javascript" src="js/move.js"></script>
<script type="text/javascript">
	function showResult(r) {
		alert(r);	
		}
</script>
<link rel="stylesheet" href="css/login.css">
</head>
<c:choose>
	<c:when test="${result !=null }">
		<body onload="showResult('${result}');">
	</c:when>
	<c:otherwise>
		<body>
	</c:otherwise>
</c:choose>
<form action="MemberInfoController" method="post" name="infoModifyF" onsubmit="return infoModifyCheck();" enctype="multipart/form-data">
		<table id="joinTable">
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="photo" type="file">
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" >
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
					<input name="id" readonly="readonly" value="${sessionScope.loginMember.id }">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					��й�ȣ ����(���� ��ȣ �Է� ������.)
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput"> 
					<input name="pw" type="password" autocomplete="off" maxlength="15" value="${sessionScope.loginMember.pw }" placeholder="�ѱ� ����, Ư�����ڴ� !@#$%^�� ����">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					��й�ȣ ��Ȯ��
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="pw2" type="password" autocomplete="off" maxlength="15" value="${sessionScope.loginMember.pw }">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					�г���
				</td>
			</tr>
			<tr>
				<td align="center" colspan="3" class="generalInput">
					<input name="name" autocomplete="off" maxlength="10" value="${sessionScope.loginMember.name }">
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
						<option>${year }</option>
						<c:forEach var="yy" begin="${curYear - 60 }" end="${curYear }">
							<option>${yy }</option>
						</c:forEach>
					</select>��
				</td>
				<td align="center">
					<select name="m">
						<option>${month }</option>
						<c:forEach var="mm" begin="1" end="12">
							<option>${mm }</option>
						</c:forEach>
					</select>��
				</td>
				<td align="center">
					<select name="d">
						<option>${day }</option>
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
					<input name="email" type="email" autocomplete="off" value="${sessionScope.loginMember.email }">
				</td>
			</tr>
			<tr>
				<td colspan="3">
					�ּ�
				</td>
			</tr>
			<tr>
				<td align="center" class="addrInput">
					<input name="addr1" autocomplete="off" placeholder="�����ȣ" value="${addr1 }">
				</td>
				<td align="center" class="addrInput">
					<input name="addr2" autocomplete="off" placeholder="�ּ�" value="${addr2 }">
				</td>
				<td align="center" class="addrInput">
					<input name="addr3" autocomplete="off" placeholder="���ּ�" value="${addr3 }">
				</td>
			</tr>
			<tr align="center" >
				<td align="center" id="mIBTd">
					<button>��������</button>
				</td>			
				<td>
				</td>
				<td align="center" >
					<div onclick="goMemberDelete()" id="memberDeleteDiv">ȸ��Ż��</div>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>