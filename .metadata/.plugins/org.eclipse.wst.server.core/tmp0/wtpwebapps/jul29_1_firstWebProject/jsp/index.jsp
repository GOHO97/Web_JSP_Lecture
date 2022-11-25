<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/move.js"></script>
<script type="text/javascript" src="js/hoValidChecker.js"></script>
<script type="text/javascript" src="js/loginValidChecker.js"></script>
<script type="text/javascript" src="js/nftWriteChecker.js"></script>

<script type="text/javascript">
	function showResult(r) {
		alert(r);	
		}
</script>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/welcome.css">
<link rel="stylesheet" href="css/nftGalleryMain.css">
</head>
<c:choose>
	<c:when test="${result !=null }">
		<body onload="showResult('${result}');">
	</c:when>
	<c:otherwise>
		<body>
	</c:otherwise>
</c:choose>
	<table id="homeTitleTable">
		<tr>
			<td align="center">
				Liiv SANDBOX & MGZ
			</td>
		</tr>
	</table>
	<table id="homeMenuTable" >
		<tr>
			<td>
				<table id = "homeMenuTable2">
					<tr align="center">
						<td>
							<a href="">������Ʈ �Ұ�</a>
						</td>
						<td>
							<a href="">Liiv SANDBOX �Խ���</a>
						</td>
						<td>
							<a href="NftGalleryWriteController">nft������</a>
						</td>
						<td>
							<a href="">���� �� ����</a>
						</td>
						<td>
							<a href="">�̴� ����</a>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table id="homeLoginTable">
		<tr>
			<td align="right">
				<table id="homeLoginTable2">
					<jsp:include page="${loginPage }"></jsp:include>
				</table>
			</td>
		</tr>
	</table>
	<table id="homeContentTable">
		<tr align="center">
			<td >
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>