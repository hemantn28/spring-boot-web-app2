<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring Boot</title>
</head>
<body>


<h2>Your Employee name is  ${obj1.getName()}</h2>

<h2>Your Employee dept  is ${ obj1.getDept()}</h2>
<h2>Your Employee age is  ${ obj1.getAge()} </h2>

<h2>Your Employee name is  ${obj2.getName()}</h2>

<h2>Your Employee dept  is ${ obj2.getDept()}</h2>
<h2>Your Employee age is  ${ obj2.getAge()} </h2>

</body>
</html>