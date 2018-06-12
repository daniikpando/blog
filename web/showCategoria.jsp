<%@page import="models.Articulo"%>
<%@page import="models.CategoriaArticulo"%>
<jsp:include page="WEB-INF/head.jsp">
    <jsp:param name="title" value="Inicio" />
</jsp:include>
<%
    CategoriaArticulo ca =(CategoriaArticulo)request.getAttribute("categoriaArticulo");
%>

<div>
    <h1><%= ca.getCategoria().get(0).getNombre() %></h1>
    
    <h4>Articulos</h4>
    
    <div>
        <% for(Articulo art: ca.getArticulo() ) {%>
            <div>
                <p> <a href="/webapp/articulo?id=<%= art.getId() %>"><%= art.getTitulo() %> </a> </p>
            </div>
        <%}%>
    </div>
</div>

<%@include file="WEB-INF/footer.html" %>
