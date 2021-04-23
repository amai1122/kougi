<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>データベースへの検索処理のサンプル</title>
  </head>
  <body>
    <h1>検索条件を入力してください。</h1>

    <form action="../servlet/tom.SearchSample" method="post">
      <table>
        <tr>
          <td>お名前：</td>
          <td><input type="text" name="name" /></td>
        </tr>
        <tr>
          <td>年齢：</td>
          <td><input type="text" name="age" />まで</td>
        </tr>
      </table>
      <br>
      <input type="submit" value="送信" />
    </form>
  </body>
</html>