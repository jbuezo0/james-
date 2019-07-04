<%-- 
    Document   : list_funct
    Created on : 1/07/2019, 11:13:12 PM
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
        <%@include file="tem/nab.jsp"%>   

    </head>
    <body


        <br><br><br>
        <div class="columns">
            <div class="column is-flex is-vcentered">
                <div class="section">
        <%@include file='tem/menu.jsp'%>
                </div>
            </div>
            <div class="column">
                <div class="card">
                    <header class=" is-center ">
                        <p class="card-header-title title is-3">             Funciones</p>
                    </header>
                    <div class="card-cotent is-flex is-horizontal-center">
                        <table class="table is-striped ">
                            <thead>
                            <th >Pelicula</th>
                            <th >Clasificacion</th>
                            <th >Hora</th>
                            <th >FechaEstreno</th>
                            </thead>
                            <tbody>

                                <c:forEach items="${list}" var="funct">
                                    <tr>
                                        
                                        <td >${funct.moviemovie}</td>
                                        <td >${funct.classification}</td>
                                        <td >${funct.hour}</td>
                                        <td>${funct.premiere}</td>
                                        <td> <a  href="FunctionsId?id=${funct.id}" class = 'button  is-success is-small is-outline'><span>Actualizar</span></a></td>
                                        <td> <a  href="Ca?id=${funct.id}" class = 'button  is-danger is-small is-outline'><span>Eliminar</span></a></td>
                                                                            <th class="title is-5"></th>
                                        <th class="title is-5"></th>
                                        <th class="title is-5"></th>

                                    </tr>

                                </c:forEach>


                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
            <div class="column"></div>
        </div>  
    </body>
</html>
