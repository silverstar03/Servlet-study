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
			<td>���̵�</td>
			<td><input type = "text" name="user_id"></td>
		</tr>
		<tr>
			<td>��й�ȣ</td>
			<td><input type="password" name="user_pw"></td>
		</tr>
		<tr>
			<td>�̸�</td>
			<td><input type="text" name="user_name"></td>
		</tr>
		<tr>
			<td>���</td>
			<td><input type="checkbox" name="hobby" value="swim">����
			<input type="checkbox" name="hobby" value="reading">å�б�
			<input type="checkbox" name="hobby" value="music">����</td>
		</tr>
		<tr>
			<td>����</td>
			<td><input type="radio" id="r1" name="gender" value="m">����
			<input type="radio" id="r1" name="gender" value="f">����</td>
		</tr>
		<tr>
			<td>����</td>
			<td><select name="job">
				<option value="teacher">������</option>
				<option value="student">�л�</option>
			</select>
		</tr>
		<tr>
			<td>�Ұ�</td>
			<td><textarea name="content" cols="40" row="5"></textarea></td>
		<tr>
			<td></td>
			<td><button type ="submit">����</button></td>
		</tr>
	</table>

	</form>
</body>
</html>