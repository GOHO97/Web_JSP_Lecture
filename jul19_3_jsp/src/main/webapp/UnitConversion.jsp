<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="css/UC.css">
<%!
private double result;
private String unit;

public double getInch(double cm) {
	double inch = cm * 0.393701;
	return inch;
}

public double getPyeong(double sm) {
	double pyeong = sm * 0.3025;
	return pyeong;
}

public double getF(double c) {
	double f = 1.8 * c + 32;
	return f;
}

public double getMih(double kmh){
	double mih = kmh * 0.621371;
	return mih;
}

%>
</head>
<body>
<%
double num = Double.parseDouble(request.getParameter("num"));
String u = request.getParameter("unit");

if(u.equals("cm")){
	result = getInch(num);
	unit = "Inch";
} else if(u.equals("sm")){
	result = getPyeong(num);
	unit = "평";
	u = "㎡";
} else if(u.equals("c")){
	result = getF(num);
	unit = "℉";
	u = "℃";
} else {
	result = getMih(num);
	unit = "mi/h";
	u = "km/h";
}
%>
	<table>
		<tr>
			<th>
				변환결과
			</th>
		</tr>
		<tr class="<%=u %>" align="center">
			<td>
				<%=num %><%=u %>
			</td>
		</tr>
		<tr class="<%=u %>" align="center">
			<td>
				↓
			</td>
		</tr>
		<tr class="<%=u %>" align="center">
			<td>
				<%=String.format("%.1f", result) %> <%=unit %>
			</td>
		</tr>
	</table>
</body>
</html>