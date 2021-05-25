<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form method = "post" action ="/ServletPrj/login2">
	<table>
		<tr>
			<td>아이디</td>
			<td><input type = "text" name="user_id"></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="user_pw"></td>
		</tr>
			<td></td>
			<td><button type ="submit">제출</button></td>
		</tr>
	</table>

	</form>

</body>
</html>