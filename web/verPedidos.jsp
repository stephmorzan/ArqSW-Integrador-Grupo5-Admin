<%-- 
    Document   : VerPedidos
    Created on : 03/07/2016, 08:40:06 PM
    Author     : Rafael
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.clases.Pedido"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:set var="usuario" scope="session" value="${sessionScope.admin}"/>
        <title>Tabla de Pedidos</title>
        <link rel="stylesheet" href="css/foundation.css">
        <link rel="stylesheet" href="css/normalize.css">
    </head>
    
    
    <body>
        <div class="large-only-text-center medium-only-text-center small-only-text-center">
            <h1>Tabla de Pedidos</h1>
        </div>
        
        
            
            <div class="large-2 columns"></div>
    <form action="detallePedidos" method="post">
            <div class="large-10 large-centered columns">
        
                <table style="width: 100%">
                    <tr>
                        
                        <th>ID del Pedido</th>
                        <th>Nombre del Cliente</th>
                        <th>Costo total</th>
                        <th>Fecha</th>
                        
                    </tr>
                    
                    
                    <%List<Pedido> pedidos = (ArrayList<Pedido>)session.getAttribute("pedidos");
                    for (Pedido p: pedidos){ %>
                                        
                    
                    
                    <tr>
                    
                        <td><input type="submit"  value="<%out.print(p.idpedido);%>" name="id"/></td>
                    
                        <td><%out.print(p.cliente);%></td>
                        
                        <td><%out.print(p.costoTotal);%></td>
                        
                        <td><%out.print(p.fecha);%></td>
                        
                        <%-- Deje comentado los datos de los pedidos, asumo que vendrán en una lista --%>
                        
                    </tr>
                    
                    <%}%>
                    
                    
                </table>

            </div>
    </form>
        <form action="cargarDeBD" method="post">
            <div class="large-2 columns"></div>
            
                <div class="large-only-text-center medium-only-text-center small-only-text-center">                    
                <input type="submit" value="Cargar nuevos pedidos"/>
                
                <%-- Se supone que el servlet al que va solamente carga los pedidos nuevos
                de la cola y luego devuelve a esta misma página que tomará los pedidos de la bd
                
                Supongo que ya lo sabías pero porsiacaso C: --%>
                                
            </div>
                <br>
                <br>
        </form>
        
    </body>
</html>
