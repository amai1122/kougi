<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>
<%@ page import="java.util.List"%>

<jsp:useBean id="br" scope="session" class="tom.Product_In_Bean" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="/firstServlet_3/css/sessionMondai.css"
	type="text/css">

<title>商品検索入力用</title>
</head>
<body>
	<h1>検索条件を入力してください</h1>
	<%
	List<String> errorList = (List<String>) request.getAttribute("errorList");
	if (errorList != null) {
	%>
	<div class="error">
		以下の入力エラーがあります。
		<ul>
			<%
			for (String err : errorList) {
			%>
			<li><%=err%></li>
			<%
			}
			%>
		</ul>
	</div>
	<%
	}
	%>

	<form action="../servlet/tom.Product_Mondai5" method="post">
		<table>
			<tr>
				<td>商品名：</td>
				<td><input type="text" name="product_name"
					value="<% if(br.getProduct_name() !=null){ %>
						<%=br.getProduct_name() %>
					<% }%>" /></td>
			</tr>
			<tr>
				<td>定価：</td>
				<td><input type="text" name="min_price"
					value="<% if(br.getPrice_min() !=null){ %>
						<%=br.getPrice_min()%>
					<% } %>" /></td>
				<td>円から</td>
				<td><input type="text" name="max_price"
					value="<% if(br.getPrice_max() !=null){ %>
						<%=br.getPrice_max()%>
					<% } %>" /></td>
				<td>円まで</td>
			</tr>
		</table>
		<input type="submit" name="set" value="送信" />
	</form>

</body>
</html>