<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
      <style>
        div {
          border: 1px solid gray;
        }

        .container {
          width: 600px;
          height: 400px;
        }

        .boardTitle {
          width: 500px;
          height: 30px;
          margin-bottom: 20px;
        }

        .boardBottom {
          text-align: right;
        }
      </style>
    </head>

    <body>
      <div class="container">
        <div class="boardHeader">
          <select>
            <option>${detail.category}</option>
          </select>
          <input type="text" name="title" class="boardTitle" value="${detail.title}" readonly>
        </div>
        <div class="boardBody">
          <textarea rows="20" cols="80" name="contents" readonly>${detail.contents}</textarea>
        </div>
        <div class="boardBottom">
          <button>목록으로</button>
        </div>
      </div>
    </body>

    </html>