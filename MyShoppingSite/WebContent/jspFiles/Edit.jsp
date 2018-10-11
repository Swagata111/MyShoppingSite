<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String s=request.getParameter("p"); %>



<form action="ProjCatServlet" method="post">
<div align="right"><a href="projectcategory.jsp">view</a></div>
<fieldset>

<legend>Edit category</legend>
<table cellspacing="2" cellpadding="2" border="0">
    <tr>
        <td align="left">Item Id</td>

        <td><input type="text" name="pcatid" value="<%=s%>" ></td>
    </tr>

    <tr>
        <td align="right">Item Name</td>
        <td><input type="text" name="pcatname"></td>
    </tr>
	<tr>
        <td align="right">Item Price</td>
        <td><input type="text" name="pcatname"></td>
    </tr>
    <tr>
        <td><input type="submit" value="submit"></td>
    </tr>

</table>

<input type="hidden" name="FUNCTION_ID" value="UPDATE">

</fieldset>
</form>
</body>
</html>