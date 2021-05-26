<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- forward : 주소가 안바뀜
	redirect : 주소가 바뀜 -->
	<form method = "post" action ="/ServletPrj/memberServlet">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type = "text" name="user_id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="user_pw"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="user_name"></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="user_age"></td>
		</tr>
		<tr>
			<td></td>
			<td><button type ="submit">제출</button></td>
		</tr>
	</table>

	</form>

</body>
</html>