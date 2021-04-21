<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bn" scope="session" class="tom.InputBean" />

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>セッション入力フォームサンプル</title>
  </head>
  <body>
    <h1>入力内容確認</h1>
    入力内容を確認してください。
    <!-- formタグ：次に呼び出すサーブレットのURL指定******************************* -->
    <form action="../servlet/tom.SessionConfSample" method="post">
      <table>
        <tr>
          <td>お名前：</td>
          <td><jsp:getProperty name="bn" property="name" /></td>
        </tr>
        <tr>
          <td>ふりがな：</td>
          <td><jsp:getProperty name="bn" property="furigana" /></td>
        </tr>
        <tr>
          <td>生年月日：</td>
          <td><jsp:getProperty name="bn" property="birthday" /></td>
        </tr>
      </table>
      <br>
      <input type="submit" name="back" value="戻る" />
      <input type="submit" name="next" value="登録" />
    </form>
  </body>
</html>