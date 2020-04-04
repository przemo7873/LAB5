<%@page contentType="text/html" pageEncoding="UTF-8"  session="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Dodaj studenta do tabeli</h1>      
        <form action='/lab5/table' method='post'>
            Przedstaw się ładnie:
            <input type='text' name='firstName'>
            <input type='text' name='lastName'>
            <input type='text' name='email'>
            <input type='submit'>
        </form>  
        <table border="1">     
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
            </tr>
            <c:forEach items="${sessionScope.s}" var="student">
                <tr>
                    <td>${student.firstName}</td> 
                    <td>${student.lastName}</td> 
                    <td>${student.email}</td>
                </tr>
            </c:forEach>    
        </table>       
    </body>
</html>

