<%-- 
    Document   : agecalculator
    Created on : 2022. 1. 15., 오후 8:16:25
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
        <h1>Age Calculator</h1>
        
        <form action="age" method="post"> 
            <label for="age">Enter your age:</label> 
            <input type="number" name="age" id="age">
            
            <!-- <input type="submit" value="<h1>submit</h1>"> -->
            <!-- <input type="submit" value="<h1>submit</h1>"><h1>SUBMIT</h1></input> -->
            <!-- <input type="submit" value="submit"> -->
            <button type="submit">Submit</button>
        </form>
        
        <p>${message}</p>
    </body>
</html>
