<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title><h1>SpringBoot Web Application</h1></title>
</head>
<body>

    Here are the list of your todos:
    <form >
    <c:if test="${empty todos }">
    ${todosblnk} 
    </c:if>
     <c:if test="${not empty todos }">
     ${todos}
     </c:if>
    <BR/>
    Your Name is : ${name}
    </form>
</body>
</html>