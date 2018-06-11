


<%@page import="models.Usuario"%>

<% 
    HttpSession sesion = request.getSession();
    Usuario u = (sesion.getAttribute("usuario") != null) ? (Usuario)sesion.getAttribute("usuario"): null;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${param.title}</title>
    </head>
    <body>
        <div>
            <nav>
                <% if(u == null ) {%>
                    <a href="login.jsp" >Iniciar sesion</a> o <a href="newUser.jsp" >Crear cuenta</a> 
                <%} else {%>
                    <a href="cerrarSesion">Cerrar sesion</a>
                <%}%>
            </nav>
        </div>
        