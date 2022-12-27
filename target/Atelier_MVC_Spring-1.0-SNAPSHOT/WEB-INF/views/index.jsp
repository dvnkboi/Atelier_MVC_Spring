<%-- 
    Document   : index
    Created on : 13 déc. 2022, 14:42:29
    Author     : Mohamed EL HADDAD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <H1> CONTROLEURS AVEC SPRING </H1>
    
        <a href="helloCtrl"> HELLO ACTION </a>
        <BR>
         <fieldset>
    <legend>Choose your Name</legend> 
        <form action="Marhaba" method="post">
                <label for="fname">Name:</label>
                <input type="text" id="fname" name="name"><br>
                <input type="submit" value="Marhba">
       </form>
      </fieldset>
    </body>
</html>
