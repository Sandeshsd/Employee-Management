<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="saveUpdateEmployee" modelAttribute="employee"> 
      <f:input path="employeeId" readonly="true"/>
      <f:input path="employeeName"/>
      <f:input path="employeePhoneNumber"/>
      <input type="submit" value="update">      
      
      </f:form>
      
</body>
</html>