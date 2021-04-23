<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>
<%@ page import="java.util.List"%>
<%-- jsp:useBeanタグ：確認画面から戻ったときの値取得*************************** --%>
<jsp:useBean id="bn" scope="session" class="tom.InputBean" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />

<!-- 練習問題5_1で追加 -->
<!-- CSSファイル読込を追加 -->
<link rel="stylesheet" href="/firstServlet_3/css/sessionMondai.css"
	type="text/css">

<title>セッション入力フォームサンプル</title>
</head>
<body>
	<h1>入力フォーム</h1>

	<!-- 練習問題5_1で追加 -->
	<!-- エラー表示  -->

	<%
	List<String> errorList = (List<String>) request.getAttribute("errorList");
	if (errorList != null) {
	%>
	<div class="error">
		以下の入力エラーがあります。
		<ul>
			<%
			for (String msg : errorList) {
			%>
			<li><%=msg%></li>
			<%
			}
			%>
		</ul>
	</div>
	<%
	}
	%>

	入力フォームにデータを入力してください。
	<!-- formタグ：次に呼び出すサーブレットのURL指定******************************* -->
	<form action="../servlet/tom.SessionInputSample" method="post">
		<table>
			<tr>
				<td>お名前：</td>
				<td><input type="text" name="name" value="<%=bn.getName()%>" /></td>
			</tr>
			<tr>
				<td>ふりがな：</td>
				<td><input type="text" name="furigana"
					value="<%=bn.getFurigana()%>" /></td>
			</tr>
			<tr>
				<td>生年月日：</td>
				<td><select name="year">
						<%
						int year = LocalDate.now().getYear();
						for (int i = year - 65; i <= year - 20; i++) {
						%>

						<option value="<%=i%>"
							<%if (bn.getYear().equals(String.valueOf(i))) {%>
							selected="selected" <%}%>><%=i%>
						</option>

						<%
						}
						%>
				</select>年 <select name="month">
						<%
						for (int i = 1; i <= 12; i++) {
						%>

						<option value="<%=i%>"
							<%if (bn.getMonth().equals(String.valueOf(i))) {%>
							selected="selected" <%}%>><%=i%>
						</option>

						<%
						}
						%>
				</select>月 <select name="day">
						<%
						for (int i = 1; i <= 31; i++) {
						%>

						<option value="<%=i%>"
							<%if (bn.getDay().equals(String.valueOf(i))) {%>
							selected="selected" <%}%>><%=i%>
						</option>

						<%
						}
						%>
				</select>日</td>
			</tr>
			<!-- 練習問題5_2で追加 -->
			<tr>
				<td>性別：</td>
				<!-- session情報からで男性または女性を選択する -->
				<td>
					<input type="radio" name="gender" value="男性"
					<% if (bn.getGender().equals("男性")|| bn.getGender()==null || bn.getGender()=="")  {%>
					checked="checked" <%}%> />男性

					<input type="radio" name="gender" value="女性"
					<% if (bn.getGender().equals("女性")) {%>
					checked="checked" <%}%> />女性
				</td>
			</tr>
			<tr>
				<!-- session情報から備考の内容を入力する -->
				<td>備考：</td>
				<td><pre><textarea name="bikou" rows="3" cols="35"><%=bn.getBikou()%></textarea>
				</pre></td>
			</tr>

		</table>
		<br> <input type="submit" value="確認" />
	</form>
</body>
</html>