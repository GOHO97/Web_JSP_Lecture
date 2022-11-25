<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href ="css/index.css" >
<link rel="stylesheet" href="css/calc.css">
<script type="text/javascript" src="js/hoValidChecker.js"></script>
<script type="text/javascript" src="js/jul252Check.js"></script>
</head>
<body>
	<table id="sideMarginR">
		<tr>
			<td>
				any
			</td>
		</tr>
	</table>
	<table id = "site">
		<tr align="center">
			<td colspan="2" id="siteTitle">
				제목
			</td>
		</tr>
		<tr align="center">
			<td colspan="2" id="siteMenu">
				<a href="CTController">홈</a>
				<a href="Menu1Controller">더하기</a>
				<a href="MainController">JSTL-Core</a>
				<a href="M4Controller">JSTL-Formatting</a>
				<a href="LController">로또추첨기</a>
			</td>
		</tr>
		<tr align="center" id=sCTd>
			<td colspan="2" id="siteContent">
				<jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="sideMarginL">
		<tr>
			<td>
				any
			</td>
		</tr>
	</table>
</body>
</html>