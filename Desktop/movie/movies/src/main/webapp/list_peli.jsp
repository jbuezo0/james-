<%-- 
    Document   : list_peli
    Created on : 26/06/2019, 02:06:58 PM
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
    <body>





        <div class="hero is-light is-fullheight"><br>

            <div class="columns">
                <div class="column is-flex is-vcentered">
                    <div class="section">
                        <%@include file='tem/menu.jsp'%>
                    </div>
                </div>
                <div class="box">
                    <c:forEach items="${list}" var="peli">

                        <article class="media">


                            <div class="media-left">
                                <figure class="image is-64x64">
                                    <img src="img/${peli.id}.jpg" alt="Image">
                                </figure>
                            </div>
                            <div class="media-content">
                                <div class="content">
                                    <p>
                                        <strong>${peli.name_movie}</strong> <small>.</small> <small> ${peli.duration}</small>       
                                        <br><span class="tag is-info">${peli.categorymovie}</span> <br>
                                        ${peli.description}        </p>
                                    <a  href="MovieId?id=${peli.id}" class = 'button  is-success  is-outline'><span>Editar</span></a>      </div>

                            </div>
                        </article>
                    </c:forEach>
                </div>
                <div class="column"> </div>   

            </div><br><br>
        </div>



    </body>
</html>



