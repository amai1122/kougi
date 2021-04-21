<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>入力フォーム</h1>

	<form action="">
		<table>
			<tr>
				<td>お名前:</td>
				<td colspan="3"><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>生年月日：</td>
				<td><select name="year">
						<%
						LocalDate ld = LocalDate.now();

						int start_y = (ld.getYear()) - 65;
						int end_y = (ld.getYear()) - 20;

						for (int y = start_y; y <= end_y; y++) {
						%>
						<option value="<%=y%>"><%=y%></option>
						<%
						}
						%>

				</select>年</td>

				<td><select name="month">
						<%
						for (int m = 1; m <= 12; m++) {
						%>
						<option value="<%=m%>"><%=m%></option>
						<%
						}
						%>
				</select>月</td>

				<td><select name="day">
						<%
						for (int d = 1; d <= 31; d++) {
						%>
						<option value="<%=d%>"><%=d%></option>
						<%
						}
						%>
				</select>日</td>
			</tr>
		</table>
		<input type="submit" name="sousin" value="送信">
	</form>


</body>
</html>