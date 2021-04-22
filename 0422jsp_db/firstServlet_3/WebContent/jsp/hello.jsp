<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>最初のJSP</title>
  </head>
  <body>
    <h1>Hello,World！</h1>
    現在日時：<%= java.time.format.DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss").format(java.time.LocalDateTime.now()) %>
  </body>
</html>