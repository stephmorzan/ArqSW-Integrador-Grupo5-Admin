<%-- 
    Document   : loginAdm
    Created on : 02/07/2016, 07:49:21 PM
    Author     : Rafael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Adm: DulceReal</title>     
        <link rel="stylesheet" href="css/foundation.css">
        <link rel="stylesheet" href="css/normalize.css">
    </head>
    
    <body>
        <div class="large-only-text-center medium-only-text-center small-only-text-center">
            <h1>Inicio de sesión para administradores</h1>
        </div>
                   
        <form action="loginAdm" method="post">
        <%-- Nose como se llamará el servlet pero lo estoy dejando como loginAdm --%>
            
            <div class="large-centered large-8 large-offset-2 columns">
                
                    <div class="row">
                        <div class="column large-8 large-offset-2 small-12">
                            Usuario: <input type="text" name="usuarioAdm">
                            <br>
                            Contraseña: <input type="password" name="clave">
                        </div>
                    </div>

                    <div class="row">
                        <div class="large-only-text-center medium-only-text-center small-only-text-center">
                            <input type="submit" value="Ingresar">
                        </div>
                    </div>
                
            </div>
            
        </form>
    </body>
    
    
    
</html>
