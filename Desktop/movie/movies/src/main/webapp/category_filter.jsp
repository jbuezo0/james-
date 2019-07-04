<%-- 
    Document   : category_filter
    Created on : 16/06/2019, 06:27:56 PM
    Author     : JBuezo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link rel="stylesheet" href="css/bulma.css">
        <link type="text/css" rel="stylesheet" href="css/estilos.css">
        <link type="text/css" rel="stylesheet" href="css/style.css">
                <%@include file="tem/navbar.jsp"%>    

        <title>Categorias</title>
    </head>
    <body>
        <div class="flex-container">
            <nav class="nav">
                <label style="margin-left: 45px; font-size: 20px">Filtrado de  Categorias</label>
            </nav>
           
              
                    
                            
    <div class="row no-gutters exclusive-tittle">

        <div class="col-md-6">
            <p class="big-tittle">Solo en Topmovie:</p>
        </div>                  
    </div>                  
    <div class="col-md-6">
        <p class="red-button"class="solo-especiales">ESPECIALES DE TEMPORADA</p>
    </div>
</div>

<section id="cajas">
    <div class="container">
                        <c:forEach items="${Movie}" var="mov">

            <div class="box">
                <a href='MovieFilter?peli=${mov.name_movie}&id=${mov.id}'>
                    <img src="img/${mov.id}.jpg" alt="Sobre Nosotros">
                </a>
                <div  class="dark">
                    <h3 class="dark" >${mov.name_movie}</h3>

                </div>
                <a class="button is-warning is-rounded" onClick="location.href = 'CategoryFilter?nombre=${mov.categorymovie}&id=${mov.id}'">${mov.categorymovie}</a>

            </div>

        </c:forEach>
    </div>
    </div
    </section>
       
    </body>
</html>
<%@include file="tem/footer.jsp"%>    
