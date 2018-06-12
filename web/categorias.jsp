<%@page import="models.Usuario"%>
<%@page import="models.Categoria"%>
<%@page import="java.util.List"%>
<jsp:include page="WEB-INF/head.jsp">
    <jsp:param name="title" value="Categorias" />
</jsp:include>
<!-- hola -->
<%
    List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
%>
<div>
    
    <h1>Categorias</h1>
    <% for(Categoria categoria :categorias  ) {%>
    <p>
        <a href="/webapp/categoria?id=<%= categoria.getId() %>"><%= categoria.getNombre()%></a>
    </p>
    <%}%>
</div>

<%@include file="WEB-INF/footer.html" %>