<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Username is: <%=request.getAttribute("name") %><br><br>
Password is: <%=request.getAttribute("pass") %>
</body>
</html>