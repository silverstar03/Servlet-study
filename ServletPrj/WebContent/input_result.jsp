<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- model ��� -->

<!-- EL(Expression Language) -->
${model }�Դϴ�<br/>

<%= request.getAttribute("model") %> �Դϴ�.
</body>
</html>