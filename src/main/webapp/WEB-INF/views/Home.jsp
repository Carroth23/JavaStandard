<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <!DOCTYPE html>
  <html>

  <head>
    <meta charset="UTF-8">
    <title>BoProc</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  </head>

  <body>
    <div class="container">
      <div class="header">로그인 시스템</div>
      <div class="content">
        <form action="/member/login" method="post">
          <input type="text" placeholder="아이디" name="id" id="id"><br>
          <input type="password" placeholder="비밀번호" name="pw"><br>
          <button>로그인</button><button type="button">회원가입</button>
        </form>
      </div>
    </div>
  </body>

  </html>