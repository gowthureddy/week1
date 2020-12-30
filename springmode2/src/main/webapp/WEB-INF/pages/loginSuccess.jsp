<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:message code="label.title"></spring:message>
<form action="">
    <spring:message code="label.firstName"/> 
    <input type="text" name="firstName">
    
     <spring:message code="label.lastName"/>  
     <input type="text" name="secondName">
     
     <spring:message code="label.submit" var="labelSubmit"/>
    <input type="submit" value="${labelSubmit}"/>
</form>
</body>
</html>