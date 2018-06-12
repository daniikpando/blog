<%@page import="models.Articulo"%>
<jsp:include page="WEB-INF/head.jsp">
    <jsp:param name="title" value="Articulo" />
</jsp:include>

<%
    Articulo art = (Articulo) request.getAttribute("articulo");
%>
<div>
    <h1><%= art.getTitulo() %></h1>
    <h4>Escrito por <%= art.getUsuario().getUsername() %></h4>
    <fieldset>
        <legend>Contenido</legend>
        <p> <%= art.getContenido() %></p>
    </fieldset>
    <p>Creado en <%= art.getFecha_creacion() %></p>
</div>


<%@include file="WEB-INF/footer.html" %>
