<%@page import="java.sql.*" %>
<%@page import="Classfiles.ConnectionFactory" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<h2 align="center">All Records</h2>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>showall</title>
</head>
<body>

<form method="post">

<table border="2" align="center">
<tr>
<td>ITEMID</td>
<td>ITEMNAME</td>
<td>ITEMPRICE</td>

</tr>
<%
try
{

String query="select * from item";
Connection conn=ConnectionFactory.getConnection();   
Statement stmt=conn.createStatement();
ResultSet rs=stmt.executeQuery(query);
while(rs.next())
{

%><tr><td><%=rs.getInt("ITEMID") %></td>
    <td><%=rs.getString("ITEMNAME") %></td>
    <td><%=rs.getString("ITEMPRICE") %></td></tr>
        <%
}
%>
    </table>
    <%
    rs.close();
    stmt.close();
    conn.close();
    }
catch(Exception e)
{
    e.printStackTrace();
    }

%>

</form>
</html> 
</body>
</html>