<%-- 
    Document   : arithmeticcalculator
    Created on : 2022. 1. 16., 오전 12:12:25
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post"> 
        <label for="first">First:</label>
        <input type="number" name="first" id="first"><br>
        
        <label for="second">Second:</label> 
        <input type="number" name="second" id="second"><br>   <!-- min="1" -->
        
        <button type="submit" name="operator" value="+">+</button>
        <button type="submit" name="operator" value="-">-</button>
        <button type="submit" name="operator" value="*">*</button>
        <button type="submit" name="operator" value="/">%</button>
            
        <!-- <button type="submit">Submit</button> -->
        </form>
        
        <p>${message}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
