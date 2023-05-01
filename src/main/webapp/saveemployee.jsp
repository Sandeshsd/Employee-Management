<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        
        <f:form action="addEmployee" modelAttribute="employee">
        <f:input path="employeeName"/>
        <f:input path="empoyeePhoneNumber"/>
        <input type="submit" value="save">
        </f:form>
        
</body>
</html>