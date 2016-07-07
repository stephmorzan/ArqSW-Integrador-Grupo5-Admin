<%-- 
    Document   : detallePedido
    Created on : 05/07/2016, 10:04:30 AM
    Author     : Rafael
--%>

<%@page import="com.clases.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.clases.Venta"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:set var="usuario" scope="session" value="${sessionScope.admin}"/>
        <%--${sessionScope.usuario}--%>
        <title>Tabla de Pedidos</title>
        <link rel="stylesheet" href="css/foundation.css">
        <link rel="stylesheet" href="css/normalize.css">
    </head>
    
    
    <body>
        <div class="large-only-text-center medium-only-text-center small-only-text-center">
            <h1>Detalle del Pedido</h1>
        </div>
        
        <div class="large-2 columns"></div>

        <div class="large-5 large-centered columns">

            <table style="width: 100%">


                
                <%List<Venta> ventas = (ArrayList<Venta>)session.getAttribute("ventas");
                for (Venta v: ventas){ %>
                
                <tr>

                    <th>#Venta</th>
                    <!--<th><%out.print("");%></th>-->

                </tr>
                <tr>

                    <td>Producto</td>

                    <!--<td>XXXXXXX</td>-->
                    <% Producto p = v.prod; %>
                    <td><%out.print(p.nombreProducto);%></td>
                    <%-- Creo que es asi jaja not sure tho --%>

                </tr>
                <tr>

                    <td>Cantidad</td>

                    
                    <td><%out.print(v.cantidad);%></td>

                </tr>

                <tr>

                    <td>Costo</td>

                    
                    <td><%out.print(v.costo);%></td>

                    <%-- Deje comentado los datos de los pedidos, asumo que vendrán en una lista --%>
                </tr>

                <%}%>
                <%--
                <%}%>
                --%>

            </table>

        </div>

        <div class="large-2 columns"></div>

            <div class="large-only-text-center medium-only-text-center small-only-text-center">                    
            <a href="verPedidos.jsp">Regresar</a>

        </div>
        
    </body>
</html>
