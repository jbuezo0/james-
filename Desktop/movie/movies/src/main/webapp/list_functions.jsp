 <%-- 
    Document   : list_functions
    Created on : 15/06/2019, 10:55:02 PM
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
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
    <script
    src="https://code.jquery.com/jquery-3.3.1.min.js"
    integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
    crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css?family=Raleway:400,700,900" rel="stylesheet">
  </head>
                 <%@include file="tem/navbar.jsp"%>    

        <title>Fuunciones</title>
    </head>
    <body>
        
               
                                       

        <div class="body-tabla">
      <div class="container">
        <div class="row no-gutters lineas-tabla">
          <div class="col-md-12 tabla-titular-grande">
            <p>Solo en TopMOvie<br>Funciones:</p>
          </div>
        </div><!--row titulo de la tabla-->
        <div class="row no-gutters lineas-tabla">
      
          
        </div><!--row tipos de planes-->
        <div class="row no-gutters lineas-tabla tabla-black">
          <div class="col-md-6">
            <a class="tabla-texto">Pelicula</a>
          </div>
          <div class="col-md-2 tabla-contenido">Clasificacion</div>
          <div class="col-md-2 tabla-contenido">Hora</div>
          <div class="col-md-2 tabla-contenido">Estreno</div>
        </div><!--precio-->
        
                                      <c:forEach items="${list}" var="functions">

        <div class="row no-gutters lineas-tabla">
          <div class="col-md-6">
            <a class="tabla-texto">${functions.moviemovie}</a>
          </div>
          <div class="col-md-2 tabla-contenido">${functions.classification}</div>
          <div class="col-md-2 tabla-contenido">${functions.hour}</div> 
          <div class="col-md-2 tabla-contenido">${functions.premiere}</div>
        </div><!--cuantas pantallas-->
                                </c:forEach>

        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
        <br>
       
      
      </div><!--container-->
    </div><!--body tabla-->
    
        
        
        
        
        
    </body>
</html>



<%--
 <table class="table is-striped">
                        <tr>
                            <th>No. Id</th>
                            <th>Clasificacion</th>
                            <th>Estreno</th>
                            <th>Hora</th>
                            <th>Ingreso</th>
                            <th>Pelicula</th>
                            <th>Editar</th>
                        </tr>
                        <c:forEach items="${list}" var="functions">
                            <tr>
                                <td>${functions.id}</td>
                                <td>${functions.classification}</td> 
                                <td>${functions.premiere}</td> 
                                <td>${functions.hour}</td> 
                                <td>${functions.usuariousuario}</td>
                                <td>${functions.moviemovie}</td>
                                <td><a class="button1" href="FunctionsId?id=${functions.id}">Ver</a></td>
                                <td><a class="button1" href="EliminarFunctions?id=${functions.id}">x</a></td>
                            </tr>
                        </c:forEach>--%>