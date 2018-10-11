<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrator Details</title>
</head>
<body>
<h1 align="center">
<% String n=request.getParameter("userName");
out.print("Welcome "+n);
%>
</h1>
<form action="/MyShoppingSite/OperationsSelected">
<h4 align="center">
Operations:<br><input type="radio" name="operations" value="add">Add Product<br>
<input type="radio" name="operations" value="update">Update Product<br>
<input type="radio" name="operations" value="delete">Delete Product<br>
<input type="radio" name="operations" value="show">Show Products<br>
<input type="radio" name="operations" value="retrieve">Retrieve Product<br><br>
<input type="submit" value="Submit">
</h4>
</form>

</body>
</html>