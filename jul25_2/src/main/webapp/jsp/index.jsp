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
				����
			</td>
		</tr>
		<tr align="center">
			<td colspan="2" id="siteMenu">
				<a href="CTController">Ȩ</a>
				<a href="Menu1Controller">���ϱ�</a>
				<a href="MainController">JSTL-Core</a>
				<a href="M4Controller">JSTL-Formatting</a>
				<a href="LController">�ζ���÷��</a>
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