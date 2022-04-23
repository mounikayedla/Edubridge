<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">
	
		First name : <form:input path="firstName"/>
		<br><br>
	
		Last name : <form:input path="lastName"/>
		<br><br>
		
		Country : 
		<form:select path="country">
			<form:options items="${student.countryOptions}"/>
			
		</form:select>
		<br><br>
		
		Favorite Language : 
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		
		<br><br>
		
		Operating Systems :
		Linux <form:checkbox path="operatingSystem" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystem" value="Mac OS"/>
		MS Windows <form:checkbox path="operatingSystem" value="MS Windows"/>
		
		<br><br>
	
		<input type="submit" value="Submit">
	
	</form:form>
</body>
</html>