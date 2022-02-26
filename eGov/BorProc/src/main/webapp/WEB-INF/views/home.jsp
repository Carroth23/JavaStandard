<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
      <style>
        .container {
          margin: 100px 0 0 100px;
        }

        #modal {
          display: none;
          width: 100%;
          height: 100%;
          position: absolute;
          top: 0;
          left: 0;
          background-color: rgba(0, 0, 0, 0.4);
        }
        .modalIn{
          position:absolute;
          top:40%;
          left:40%;
          border:1px solid white;
        }
      </style>
    </head>

    <body>
      <div class="container">
        <div classs="header">
          로그인화면입니다.
        </div>
        <div class="contents">
          <form action="/member/login" method="post">
            <input type="text" placeholder="ID입력" name="id"><br>
            <input type="password" placeholder="PW입력" name="pw"><br>
            <button>로그인</button>
            <button type="button" id="signupModalOpen">회원가입</button>
          </form>
        </div>
      </div>
      <div id="modal">
        <div class="modalIn">
          <div class="modalHeader">회원가입</div>
          <div class="modalContents">
            <form action="/member/signup" method="post">
              <input type="text" placeholder="이름" name="name"><br>
              <input type="text" placeholder="아이디" name="id"><br>
              <input type="password" placeholder="비밀번호" name="pw">
              <button>가입</button>
            </form>
          </div>
          <button id="modalClose">닫기</button>
        </div>
      </div>
      <script>
        'use strict'
        $("#signupModalOpen").on("click", () => {
          $("#modal").css('display', 'block');
        });
        $("#modalClose").on("click", () =>{
          $("#modal").css('display', 'none');
        });
      </script>
    </body>

    </html>