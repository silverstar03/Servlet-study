<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<!-- forward : �ּҰ� �ȹٲ�
	redirect : �ּҰ� �ٲ� -->
	<form method = "post" action ="/ServletPrj/memberServlet">
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
			<td>����</td>
			<td><input type="text" name="user_age"></td>
		</tr>
		<tr>
			<td></td>
			<td><button type ="submit">����</button></td>
		</tr>
	</table>

	</form>

</body>
</html>