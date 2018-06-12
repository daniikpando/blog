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
        <link rel="stylesheet" href="css/estilo.css">
    </head>
    <body>
        <div class="container">
            <h1 id="title1"><center>Crear usuario</center></h1>
            
            <form action="signUp" method="POST">
                <center>
                    <div>
                    <label>
                        <input type="text" name="username" placeholder="Ingresar nombre de usuario" required class="new">
                    </label>
                </div>
                    <br>
                <div>
                    <label>
                        <input type="email" name="email" placeholder="Ingresar email" required class="new">
                    </label>
                </div>
                    <br>
                <div >
                    <label>
                         <input type="password" name="pass" placeholder="Ingresar contraseña" required class="new">
                    </label>
                </div>
                    <br>
                <div>
                    <label>
                        <input type="password" name="pass_conf" placeholder="Ingresar confirmacion de contraseña" required class="new">
                </div>    
                    <br>
                <div class="new">
                    <button type="submit">Registrarse</button>
                    
                </div>
                </center>
            </form>
        </div>
    </body>
</html>
