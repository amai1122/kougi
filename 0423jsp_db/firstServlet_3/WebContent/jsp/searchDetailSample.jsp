<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="tom.MemberInfoBean" %>
<jsp:useBean id="mb" scope="request" class="tom.MemberInfoBean" />
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>データベースへの検索処理のサンプル</title>
  </head>
  <body>
    <h1>データベースからの検索結果詳細</h1>
    <table border="1">
      <tr>
        <th>ふりがな</th>
        <th>生年月日1</th>
        <th>生年月日2</th>
      </tr>
      <tr>
        <td>
          <%=mb.getFurigana() %>
        </td>
        <td>
          <%-- 生年月日の表記1 --%>
          <%=mb.getBirthday() %>
        </td>
        <td>
          <%-- 生年月日の表記2 (誕生日の表記は、1，2どちらでも構いません)--%>
          <jsp:getProperty name="mb" property="birthday" />
        </td>
      </tr>
    </table>
  </body>
</html>