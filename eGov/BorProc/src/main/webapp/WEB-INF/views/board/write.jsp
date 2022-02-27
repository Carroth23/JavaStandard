<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
      <!-- include libraries(jQuery, bootstrap) -->
      <link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">

      <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

      <!-- include summernote css/js -->
      <link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
      <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>
      <style>
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
        <form action="/board/write" method="post">
          <div class="boardHeader">
            <select name="category">
              <option value="선택">선택</option>
              <option value="자유">자유</option>
              <option value="게임">게임</option>
              <option value="여행">여행</option>
            </select>
            <input type="text" name="title" class="boardTitle" required>
          </div>
          <div class="boardBody">
            <textarea rows="15" cols="80" name="contents" id="summernote"></textarea>
          </div>
          <div class="boardBottom">
            <button>글쓰기</button>
          </div>
        </form>
      </div>
      <script>
        $(document).ready(function () {
          $('#summernote').summernote({
            height: 300,                 // set editor height
            minHeight: null,             // set minimum height of editor
            maxHeight: null,             // set maximum height of editor
            focus: true
          });
        });
      </script>
    </body>

    </html>