<%-- 
    Document   : calcularTriangulo
    Created on : 06/09/2021, 07:07:00 PM
    Author     : USER
--%>

<%@page import="clases.Triangulo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados:</h1>
        <%
        int Tm1 = Integer.parseInt(request.getParameter("m1"));
        int Tm2 = Integer.parseInt(request.getParameter("m2"));
        int Tn1 = Integer.parseInt(request.getParameter("n1"));
        int Tn2 = Integer.parseInt(request.getParameter("n2"));
        int Tp1 = Integer.parseInt(request.getParameter("p1"));
        int Tp2 = Integer.parseInt(request.getParameter("p2"));
        
        Triangulo triangulo=new Triangulo(Tm1,Tm2,Tn1,Tn2,Tp1,Tp2);
        %>
        Resultados:<br>
        Tm1:<%=Tm1%><br>
        Tm2:<%=Tm2%><br>
        Tn1:<%=Tn1%><br>
        Tn2:<%=Tn2%><br>
        Tp1:<%=Tp1%><br>
        Tp2:<%=Tp2%><br>
        Perimetro 1:<%=triangulo.getPerimetro1()%><br>
        Perimetro 2:<%=triangulo.getPerimetro2()%><br>
        Perimetro 3:<%=triangulo.getPerimetro3()%><br>
        Perimetro total:<%=triangulo.getPerimetroT()%><br>
        
    </body>
</html>
