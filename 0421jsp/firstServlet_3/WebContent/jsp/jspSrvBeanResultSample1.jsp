<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="bn" scope="request" class="tom.JspSrvBean" />
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>サーブレットとJSPとJavaBeansの連携サンプル</title>
  </head>
  <body>
    <h1>入力結果</h1>
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
      <tr>
        <td>性別：</td>
        <td><jsp:getProperty name="bn" property="gender" /></td>
      </tr>
      <tr>
        <td>備考：</td>
        <td><pre><jsp:getProperty name="bn" property="bikou" /></pre></td>
      </tr>

    </table>
  </body>
</html>