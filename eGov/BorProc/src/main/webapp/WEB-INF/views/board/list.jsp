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
          border: 1px solid gray;
          width: 800px;
          height: 600px;
        }
        .header{
          text-align: right;
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
      </div>
    </body>

    </html>