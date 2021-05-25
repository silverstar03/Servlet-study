<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form method = "post" action ="/ServletPrj/login">
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
			<td>취미</td>
			<td><input type="checkbox" name="hobby" value="swim">수영
			<input type="checkbox" name="hobby" value="reading">책읽기
			<input type="checkbox" name="hobby" value="music">음악</td>
		</tr>
		<tr>
			<td>성별</td>
			<td><input type="radio" id="r1" name="gender" value="m">남자
			<input type="radio" id="r1" name="gender" value="f">여자</td>
		</tr>
		<tr>
			<td>직업</td>
			<td><select name="job">
				<option value="teacher">선생님</option>
				<option value="student">학생</option>
			</select>
		</tr>
		<tr>
			<td>소개</td>
			<td><textarea name="content" cols="40" row="5"></textarea></td>
		<tr>
			<td></td>
			<td><button type ="submit">제출</button></td>
		</tr>
	</table>

	</form>
</body>
</html>