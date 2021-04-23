<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="tom.MemberInfoBean" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>データベースへの検索処理のサンプル</title>
  </head>
  <body>
    <h1>データベースからの検索結果</h1>
    <% // 検索結果のデータリストを取得
       List<MemberInfoBean> list = (List<MemberInfoBean>)request.getAttribute("memberList");
       // 取得できなかった場合、メッセージ出力
       // 取得できた場合、データを出力
       if (list.isEmpty()) {
           out.print("該当のデータはありません。");
       } else {
    %>
    <table border="1">
      <tr>
        <th>名前</th>
        <th>詳細</th>
      </tr>
      <% for (MemberInfoBean bn : list) { %>
      <tr>
        <td>
          <%=bn.getName() %>
        </td>
        <td>
          <form action="../servlet/tom.SearchDetailSample" method="post">
            <input type="submit" value="詳細" />
            <!-- hiddenタグ：リクエストにデータを設定************************************** -->
            <input type="hidden" name="furigana" value="<%=bn.getFurigana() %>" />
            <input type="hidden" name="birthday" value="<%=bn.getYear() %>年<%=bn.getMonth() %>月<%=bn.getDay() %>日" />
          </form>
        </td>
      </tr>
      <% } %>
    </table>
    <% } %>
  </body>
</html>