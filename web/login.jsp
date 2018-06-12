

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilo.css">
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <h1 id="title1"><center>Iniciar sesion</center></h1>
        <form action="login" method="POST">
            <div>
                <center>
                    <input type="email" placeholder="ingresa tu correo" name="email" autocomplete="off" class="login"> 
                    
                </center>
            </div>
            <br>
            <div>
                <center>
                    <input type="password" placeholder="ingresa tu contraseña" name="pass" autocomplete="off" class="login"> 
                </center>
            </div>
            <br>
            <div>
                <center>
                    <button type="submit">Enviar</button>
                </center>
            </div>
        </form>
    </body>
</html>
