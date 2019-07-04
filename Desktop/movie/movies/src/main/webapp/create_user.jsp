<%-- 
    Document   : create_user
    Created on : 16/06/2019, 12:16:20 AM
    Author     : JBuezo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <link rel="stylesheet"href="${pageContext.request.contextPath}/Estilos/css.css" type="text/css"><link>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
       
<ul>
  <li><a class="active" href="login.jsp">Login</a></li>
  
</ul>
      
    
     
       
       <div class="pagewrap">
	<form class="form" id="form" method="post" action="CreateUsuario">
		<h3 class="form__title">Registro</h3>
		<div class="container">
			<input class="container__input" type="text" name="name" required>
			<label id="userLabel" for="username" class="container__label">Usuario</label>
		</div>
		<div class="container">
			<input class="container__input" type="password" name="pass" required>
			<label id="passLabel" for="pass" class="container__label">Contraseña</label>
		</div>
                
		<button class="form__submit"  >Ok..</button> <br>
		 <a class="form__submit1" href="Login.jsp" >Iniciar Seseion.</a> 
              

            <c:forEach items="${list}" var="usuario">
                <p>${usuario.user_name} </p>
            </c:forEach>

	</form>
           
</div>
       
    </body>
</html>
