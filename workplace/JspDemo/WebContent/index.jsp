<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scriptlet Tag</h1>
<% out.print("Welcome"); %>
<h1>Expression Tag</h1>
<%="Welcome to JSP" %>
<h1>Declaration Tag</h1>
<%! int a=10; %>
<%! int cube(int n){ 
return n*n*n;
}

%>
<%="Cube of 3 is="+cube(3) %>
<%="Value of a is="+a %>
</body>
</html>