<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<button id="boardGo">게시판으로</button>
	<script>
		document.querySelect("#boardGo").addEventListener("click", => {
			location.href="/board/list";
		})
	</script>
</body>
</html>