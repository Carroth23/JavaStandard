<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
      <style>
        * {
          list-style: none;
          text-decoration: none;
        }

        .container {
          border: 1px solid gray;
          width: 800px;
          height: 600px;
        }

        .header {
          text-align: right;
        }

        .boardHeadIn li {
          float: left;
          width: 20%;
        }

        .boardHead {
          width:100%;
          height:50px;
          border:1px solid gray;
        }
        .boardCon{
          border-bottom:1px solid gray;
          width:90%;
          margin:auto;
          height:25px;
        }
      </style>
    </head>

    <body>
      <div class="container">
        <div class="header">
          <form action="/board/search" method="get">
            <select name="category">
              <option value="">선택</option>
              <option value="자유">자유</option>
              <option value="게임">게임</option>
              <option value="여행">여행</option>
            </select>
            <input type="text" placeholder="검색어 입력" name="searchTxt"><button>검색</button>
          </form>
        </div>
        <div class="board">
          <div class="boardHead">
            <ul class="boardHeadIn">
              <li>카테고리</li>
              <li>제목</li>
              <li>작성자</li>
              <li>조회수</li>
              <li>날짜</li>
            </ul>
          </div>
          <c:forEach var="list" items="${list}">
          <div class="boardCon">
            <ul class="boardHeadIn">
              <li>${list.category}</li>
              <li><a href="">${list.title}</a></li>
              <li>${list.writer}</li>
              <li>${list.view_count}</li>
              <li>${list.date}</li>
            </ul>
          </div>
        </c:forEach>
          <div class="page">${navi}</div>
        </div>
      </div>
    </body>

    </html>