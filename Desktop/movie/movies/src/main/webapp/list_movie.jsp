<%-- 
    Document   : list_movie
    Created on : 7/06/2019, 09:47:40 PM
    Author     : JBuezo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <link rel="stylesheet" href="css/bulma.css">
        <link type="text/css" rel="stylesheet" href="css/estilos.css">
        <link type="text/css" rel="stylesheet" href="css/style.css">
        <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.min.js "integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="crossorigin="anonymous"></script>
        <link href="https://fonts.googleapis.com/css?family=Raleway:400,700,900" rel="stylesheet">
        <%@include file="tem/navbar.jsp"%>    

        <title>Pelicuas</title>
    </head>
    <body>






        <div class="body-up">
            <div class="container-fluid">
                <div class="container">
                    <div class="row">
                        <div class="col-md-3"></div>
                        <div class="col-md-6 whiplash-text">
                            <h5 class="lil-tittle">PELICULA DESTACADA:</h5>
                            <h1 class="big-tittle">roow therr</h1>
                            <h5 class="resumen-up">Las habilidades y salud mental de Andrew Neiman serán empujadas hasta el limite por su instructor Terence Fletcher, conocido tanto por su talento como por sus aterradores métodos de enseñanza, con el objetivo de alcanzar la cima dentro del elitista conservatorio de música de la Costa Este en el que recibe su formación.</h5>
                        </div>
                        <div class="col-md-3"></div>
                    </div><!--row-->
                </div><!--container-->
            </div><!--container fluid-->
        </div><!--body up-->
    </div><!--body up-->



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
        <c:forEach items="${list}" var="peli">

            <div class="box">
                <a href='MovieFilter?peli=${peli.name_movie}&id=${peli.id}'>
                    <img src="img/${peli.id}.jpg" alt="Sobre Nosotros">
                </a>
                <div  class="dark">
                    <h3 class="dark" >${peli.name_movie}</h3>

                </div>
                <a class="button is-warning is-rounded" onClick="location.href = 'CategoryFilter?nombre=${peli.categorymovie}&id=${peli.id}'">${peli.categorymovie}</a>

            </div>

        </c:forEach>

    </div>
</section>

</body>
</html>

<%@include file="tem/footer.jsp"%>    
