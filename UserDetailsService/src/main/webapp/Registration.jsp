<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml"
  xmlns:th="http://www.thymeleaf.org">

<head>
  <title>Registration Page</title> 
</head>
<body> 
      <h4>New User Registration</h4>

      <form  action="/addUser">
        Username:<input type="text" name="username" placeholder="Enter Username"><br><br>
        Password:<input type="password" name="password" placeholder="Enter Password"><br><br>
                 <input type="submit" value="Sign-up">
       </form> 
</body>

</html>