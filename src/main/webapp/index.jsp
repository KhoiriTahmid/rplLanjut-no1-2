<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Masukan panjang dan lebar!" %>
</h1>
<br/>
<form action="hello-servlet" method="post">
    <input type="text" name="Panjang" placeholder="Panjang"><br>
    <input type="text" name="Lebar" placeholder="Lebar"><br>
    <input type="Submit" value="Login">
</form>
</body>
</html>