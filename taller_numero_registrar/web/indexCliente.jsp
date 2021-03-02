<%-- 
    Document   : indexCliente
    Created on : 25/02/2021, 10:21:03 PM
    Author     : oscar sanabria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
         <form action="controllerCliente">
        <input type="text" name="nombre" placeholder="nombre">
          <input type="text" name="documento" placeholder="documento">
          <input type="text" name="lugar" placeholder="lugar">
          
          <input type="submit" value="registrar" name="btnRegistrar">
        </form>
    </body>
</html>
