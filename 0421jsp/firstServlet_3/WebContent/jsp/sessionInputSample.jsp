<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>
<%-- jsp:useBeanタグ：確認画面から戻ったときの値取得*************************** --%>
<jsp:useBean id="bn" scope="session" class="tom.InputBean" />

<!DOCTYPE html>
<html>
<head>
<!-- 練習問題5_1で追加 -->
<!-- CSSファイル読込を追加 -->
<meta http-equiv="Content-Style-Type" content="text/css" charset="UTF-8" />
<link rel="stylesheet" href="使用するスタイルシート名">


<title>セッション入力フォームサンプル</title>
</head>
<body>
	<h1>入力フォーム</h1>
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
		</table>
		<br> <input type="submit" value="確認" />
	</form>
</body>
</html>