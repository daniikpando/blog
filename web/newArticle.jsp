<%@page import="java.util.List"%>
<%@page import="models.Categoria"%>
<jsp:include page="WEB-INF/head.jsp">
    <jsp:param name="title" value="Crear Articulo" />
</jsp:include>

<%
    List<Categoria> categorias = (List<Categoria>) request.getAttribute("categorias");
%>
<div>
    <h1>Crear articulo</h1>
    <form action="/webapp/articulo/guardar" method="POST">
        
        <div>
            <label>
                Titulo: <input type="text" name="titulo" placeholder="Ingresar el titulo" required/>
            </label>
        </div>
        <div>
            <label>
                Contenido: <input type="text" name="contenido" placeholder="Ingresar contenido" required/>
            </label>
        </div>
        <div>
            <label>
                Descripción: <input type="text" name="descripcion" placeholder="Ingresar descripcion" required/>
            </label>
        </div>
        <div>
            <fieldset>
                <legend>Elige las categorias a las que pertenece
                </legend>
                <label>
                    <% for(Categoria categoria : categorias) { %>
                        <div>
                            <input type="checkbox" name="categoria" value="<%= categoria.getId() %>">
                            <label for="categoria"><%= categoria.getNombre() %></label>
                      </div>
                    <%}%>
                </label>
            </fieldset>
        </div>
        <div>
            <input type="submit" value="Crear" />
        </div>
    </form>
</div>

<%@include file="WEB-INF/footer.html" %>