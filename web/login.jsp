<jsp:include page="WEB-INF/head.jsp">
    <jsp:param name="title" value="Iniciar sesion" />
</jsp:include>

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
<%@include file="WEB-INF/footer.html" %>