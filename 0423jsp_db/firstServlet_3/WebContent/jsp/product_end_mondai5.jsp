<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="tom.ProductBean"%>
<%--
<jsp:useBean id="bn" scope="request" class="tom.ProductBean" />
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果表示</title>
</head>
<body>
	<h1>データベースからの検索結果</h1>

	<table border="1">
		<tr>
			<th>商品ID</th>
			<th>商品名</th>
			<th>カテゴリーID</th>
			<th>価格</th>
		</tr>
		<%
		List<ProductBean>beanlist=(List<ProductBean>)request.getAttribute("bn");
		for( ProductBean bn_out :beanlist){%>
		<tr>
			<td><%=bn_out.getProduct_id() %></td>
			<td><%=bn_out.getProduct_name() %>></td>
			<td><%=bn_out.getCategory_id() %></td>
			<td><%=bn_out.getPrice() %></td>
		</tr>
		<% } %>
		<tr>
	</table>
</body>
</html>