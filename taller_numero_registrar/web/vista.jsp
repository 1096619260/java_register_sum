<%-- 
    Document   : vista
    Created on : 24/02/2021, 10:53:36 PM
    Author     : oscar sanabria
--%>




<%@page import="modelo.Operaciones"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>la suma es:</h1>
      <%=request.getAttribute("resultado") %>   
         
   <%--       
         <% 
          int n1=0;
            int n2=0;
              int r=0;
         Operaciones u =new Operaciones(n1, n2, r);
         u.sumar();
       u.getResult() ;
       
         %>
  --%>
</html>
