

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar Sesión</title>
    </head>
    <body>
        <h1>Iniciar sesion</h1>
        <form action="login" method="POST">
            <div>
                <label>
                    Email: <input type="email" placeholder="ingresa tu correo" name="email"> 
                </label>
            </div>
            <div>
                <label>
                    Contraseña: <input type="password" placeholder="ingresa tu contraseña" name="pass"> 
                </label>
            </div>
            <div>
                <input type="submit" value="Enviar" />
            </div>
        </form>
    </body>
</html>
