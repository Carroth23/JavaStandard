<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
  *{
    list-style: none;
  }
  .container{
    width:700px;
    height:700px;
    border:1px solid red;
  }
  .borHeader>ul>li{
    float:left;
    width:100px;
  }
  .borCon ul li{
    float:left;
    width:100px;
    border-bottom: 1px solid gray;
  }
</style>
</head>
<body>
  <div class="container">
    <div class="borHeader">
      <ul>
        <li>번호</li>
        <li>제목</li>
        <li>내용</li>
        <li>조회수</li>
        <li>작성일</li>
      </ul>
    </div><br>
    <c:forEach var="list" items="${list}">
    <a href=""><div class="borCon">
      <ul>
        <li>${list.seq}</li>
        <li>${list.title}</li>
        <li>${list.contents}</li>
        <li>${list.view_count}</li>
        <li>${list.write_date}</li>
      </ul>
    </div></a><br>
    </c:forEach>
    <div class="naviGround">${navi}</div>
  </div>
</body>
</html>