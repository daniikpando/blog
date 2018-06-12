


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
                <ul>
                    
                    <li>
                        <a href="/webapp">Inicio</a>
                    </li>
                    <li>
                        <a href="/webapp/categorias">Categorias</a>
                    </li>
                    <% if(u != null ) {%>
                        <li>
                            <a href="/webapp/articulo/nuevo" >Crear articulo</a>
                        </li>  
                    <%}%>
                    <li>
                        
                        <% if(u == null ) {%>
                            <a href="/webapp/login.jsp" >Iniciar sesion</a> o <a href="/webapp/newUser.jsp" >Crear cuenta</a> 
                        <%} else {%>
                            <a href="/webapp/cerrarSesion">Cerrar sesion</a>
                        <%}%>
                    </li>
                    
                </ul>
            </nav>
        </div>
        