<jsp:include page="WEB-INF/head.jsp">
    <jsp:param name="title" value="Registrarse" />
</jsp:include>

<div class="container">
    <h1>Crear usuario</h1>

    <form action="signUp" method="POST">
        <div>
            <label>
                Username: <input type="text" name="username" placeholder="Ingresar nombre de usuario" required>
            </label>
        </div>
        <div>
            <label>
                Email: <input type="email" name="email" placeholder="Ingresar email" required>
            </label>
        </div>
        <div>
            <label>
                Contraseņa: <input type="password" name="pass" placeholder="Ingresar contraseņa" required>
            </label>
        </div>
        <div>
            <label>
                Confirmar contraseņa: <input type="password" name="pass_conf" placeholder="Ingresar confirmacion de contraseņa" required>
            </label>
        </div>    
        <div>
            <input type="submit" value="Registrarse"/>
        </div>
    </form>
</div>

<%@include file="WEB-INF/footer.html" %>