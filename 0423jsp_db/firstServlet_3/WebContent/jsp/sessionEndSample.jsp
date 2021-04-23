<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>セッション入力フォームサンプル</title>
  </head>
  <body>
    <h1>登録完了</h1>
    登録完了しました。
    <br>
    <!-- formタグ：次に呼び出すJSPのURL指定******************************* -->
    <form action="../jsp/sessionInputSample.jsp" method="post">
      <input type="submit" value="追加登録" />
    </form>
  </body>
</html>