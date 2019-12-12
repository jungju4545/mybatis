<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form action="/user/join" method="POST">

아이디 : <input type="text" name = "username" placeholder="Username"/><br>
비밀번호 : <input type="password" name = "password" placeholder="Password"/><br>
이메일 : <input type="email" name = "email" placeholder="Email"/><br>
<input type="submit" value = "가입"><br>

</form>
</body>
</html>