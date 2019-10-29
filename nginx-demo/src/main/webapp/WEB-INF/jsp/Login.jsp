<%@page session="false" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login Success Page</title>
</head>

<body>

<%
    String loginUser = request.getParameter("user");
%>
<h3>用户:: <%= loginUser%>登录失败！</h3>
<form action="/login" method="POST">
    Username: <input type="text" name="user">
    <br>
    Password: <input type="password" name="pwd">
    <br>
    <input type="submit" value="Login">
</form>
</body>
</html>