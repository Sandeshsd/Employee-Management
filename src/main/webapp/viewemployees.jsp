<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="e"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <table>
      <tr>
      <th>employee id</th>
      <th>employee name</th>
      <th>employee phone number</th>
      <th>update </th>
      <th>delete </th>
      </tr>
      <e:forEach  var="employee" items="${employees}">
      <tr>
      <td>${employee.getEmployeeId()}</td>
      <td>${employee.getEmployeeName()}</td>
      <td>${employee.getEmpoyeePhoneNumber()}</td>
      <td><a href="updateEmployee?id=${employee.getEmployeeId()} ">update</a></td>
      <td> <a href="deleteEmployee?id=${employee.getEmployeeId()} ">delete</a></td>
      </tr>
     </e:forEach>
     </table>
      


</body>
</html>