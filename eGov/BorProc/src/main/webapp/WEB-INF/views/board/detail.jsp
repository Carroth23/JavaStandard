<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
      <meta charset="UTF-8">
      <title>Insert title here</title>
      <!-- include libraries(jQuery, bootstrap) -->
      <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
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

        #summernote{
          border:1px solid gray
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
          <textarea name="contents" id="summernote" readonly>${detail.contents}</textarea>
        </div>
        <div class="boardBottom">
        <c:if test="${id == detail.writer}">
          <button id="updateBtn">수정하기</button>
          <button id="deleteBtn">삭제하기</button>
        </c:if>
          <button id="listBack">목록으로</button>
        </div>
      </div>
      <script>
        $("#deleteBtn").on("click", () => {
          location.href="/board/delete?seq=${detail.seq}";
        });
        $(document).ready(function () {
          $('#summernote').summernote({
            height: 300,                 // set editor height
            minHeight: 300,             // set minimum height of editor
            maxHeight: null,             // set maximum height of editor
            airMode: true
          });
        });
        $("#listBack").on("click", () => {
          history.back();
        });
        $("#updateBtn").on("click", function(){
          location.href="/board/update?seq=${detail.seq}";
        });
      </script>
    </body>

    </html>