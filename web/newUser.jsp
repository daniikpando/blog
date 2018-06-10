<%-- 
    Document   : newUser
    Created on : 10/06/2018, 04:42:11 PM
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Registrar usuario</title>
    </head>
    <body>
        <div class="container">
            <h1>Crear usuario</h1>
            
            <form action="signUp" method="POST">
                <div>
                    <label>
                        Username: <input type="text" name="username" placeholder="Ingresar nombre de usuario" required>
                    </label>
                </div>
                <div>
                    <label>
                        Email: <input type="email" name="email" placeholder="Ingresar email" required>
                    </label>
                </div>
                <div>
                    <label>
                        Contraseña: <input type="password" name="pass" placeholder="Ingresar contraseña" required>
                    </label>
                </div>
                <div>
                    <label>
                        Confirmar contraseña: <input type="password" name="pass_conf" placeholder="Ingresar confirmacion de contraseña" required>
                    </label>
                </div>    
                <div>
                    <input type="submit" value="Registrarse"/>
                </div>
            </form>
        </div>
    </body>
</html>
