<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.main{
margin-top:85px;
}
input[type=text] {
  width: 20%;
  padding: 10px 15px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px solid #555;
  outline: none;
}

input[type=text]:focus {
  background-color: lightblue;
}
input[type=password] {
  width: 20%;
  padding: 10px 15px;
  margin: 8px 0;
  box-sizing: border-box;
  border: 1px solid #555;
  outline: none;
}

input[type=password]:focus {
  background-color: lightblue;
}
input[type=submit]{
                 width: 15px;
                 position: absolute;
                 background: #09c;
                 color: #fff;
                 font-family: tahoma,geneva,algerian;
                 height: 30px;
                 -webkit-border-radius: 15px;
                 -moz-border-radius: 15px;
                 border-radius: 15px;
                 bor
</style>
<body>
<div class="main">
<h1 style="text-align:center">Login</h1>
 ${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="login" method="post" style="text-align:center">
<input type="text" name="username" placeholder="Enter Username"><br><br>
<input type="password" name="password" placeholder="Enter Password"><br><br>
<input type="submit" value="Login">
</form>
</div>
</body>
</html>