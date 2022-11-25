<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css"> 
<link rel="stylesheet" href="css/menu3.css"> 
<link rel="stylesheet" href="css/write.css">
<link rel="stylesheet" href="css/boardContent.css">
<script type="text/javascript" src="js/hoValidChecker.js"></script>
<script type="text/javascript" src="js/write.js"></script>
<script type="text/javascript" src="js/move.js"></script>

<script type="text/javascript">
	function showResult(r) {
		alert(r);	
		}
</script>
<script type="text/javascript" src="js/move.js"></script>
</head>
<c:choose>
	<c:when test="${result !=null }">
		<body onload="showResult('${result}');">
	</c:when>
	<c:otherwise>
		<body>
	</c:otherwise>
</c:choose>
	<table id="siteTitleArea">
		<tr>
			<td id="siteTitleArea2" align="center">
				<table>
					<tr align="center">
						<td>
							<a href="M1Controller">메뉴1</a>
						</td>
						<td>
							<a href="M2Controller">게시판</a>
						</td>
						<td>
							<a href="">메뉴</a>
						</td>
						<td>
							<a href="">메뉴</a>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	<table id="siteTitleArea3">
		<tr id="sT3Tr">
			<td>
				<a href="HomeController">제목</a>
			</td>
		</tr>
	</table>
	<table id="noneT">
	</table>
	<table id="contentArea">
		<tr>
			<td>
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>