<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
			<tr>
				<td>
					나는 v2
				</td>			
				<td>
				</td>			
			</tr>
		</table>
					${param.a }<hr>
					${param.a + 1 }<hr>
					${param.b}
					${paramValues.c[0]}<hr>
					${paramValues.c[1]}<hr>
					${d }<hr>
					${h.name }<hr>
					${h.age }<hr>
					
					${hh[0].name } - ${hh[0].age }<hr> 
					
</body>
</html>