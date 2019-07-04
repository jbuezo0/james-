<%-- 
    Document   : genero
    Created on : 28/06/2019, 02:00:35 PM
    Author     : JBuezo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="css/bulma.css">
             <link type="text/css" rel="stylesheet" href="css/estilos.css">
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <%@include file="tem/navbar.jsp"%>    

        <title>JSP Page</title>
        
    </head>
    <body>
        


       

<div class="row no-gutters exclusive-tittle">

    <div class="col-md-6">
        <p class="big-tittle">Solo en Topmovie:</p>
    </div>                  
</div>                  
<div class="col-md-6">
    <p class="red-button"class="solo-especiales">CATEGORIAS</p>
</div>
    </div>
    
    
    <br>
    <br>
    <br>
   
    
<section id="cajas">
    <div class="container">
                                     <c:forEach items="${lista}" var="peli1">

            <div class="box">
                <%-- <img src="ig/${peli.id}.jpg" alt="Sobre Nosotros">--%>
                </a>
                <div  class="dark">
<h1 class=" is-warning " >${peli1.name_category}</h1></td>
                    
                </div>
                <a class="button is-warning is-rounded" onClick="location.href = 'CategoryFilter?nombre=${peli1.categorymovie}&id=${peli1.id}'">${peli1.categorymovie}</a>

            </div>

        </c:forEach>
    </div>
</section>


    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
   
    
<footer class="footer has-background-dark">
    <p>
      <strong>Bulma</strong> 
    </p>
  </div>
</footer>
<script type="text/javascript">
	document.addEventListener('DOMContentLoaded', () => {

  // Get all "navbar-burger" elements
  const $navbarBurgers = Array.prototype.slice.call(document.querySelectorAll('.navbar-burger'), 0);

  // Check if there are any navbar burgers
  if ($navbarBurgers.length > 0) {

    // Add a click event on each of them
    $navbarBurgers.forEach( el => {
      el.addEventListener('click', () => {

        // Get the target from the "data-target" attribute
        const target = el.dataset.target;
        const $target = document.getElementById(target);

        // Toggle the "is-active" class on both the "navbar-burger" and the "navbar-menu"
        el.classList.toggle('is-active');
        $target.classList.toggle('is-active');

      });
    });
  }

});
</script>
</body>
</html>