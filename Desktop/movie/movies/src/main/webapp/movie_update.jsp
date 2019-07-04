<%-- 
    Document   : movie_update
    Created on : 7/06/2019, 09:59:41 PM
    Author     : JBuezo
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="tem/nab.jsp"%>   
<link rel="stylesheet" href="css/bulma.css">
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>Actualizar Pelicula</title>
    </head>
    <body>

                        
                        
        <div class="hero is-light is-fullheight">
            <div class="columns">
                <div class="column is-flex is-vcentered">
                    <div class="section">
                        <%@include file='tem/menu.jsp'%>
                    </div>
                </div>
                <div class="column is-trhee-quarters is-vcentered"><br><br><br>
                    <div class="box">
        <form method="post" action="MovieUpdate">
                            <input name="id" class="input" type="hidden"  placeholder="Movie" value="${movie.id}">

                            <h1 class="title is-4">Nueva Categoria</h1>

                            <div class="field">
                                <div class="control">
                                    <input required class="input" type="text" name="name_movie" value="${movie.name_movie}">
                                </div>
                            </div>
                                <div class="field">
                                <div class="control">
                                    <input required class="input" type="text" name="duration" value="${movie.duration}">
                                </div>
                            </div>
                                <div class="field">
                                <div class="control">
                                    <input required class="input" type="text" name="description" value="${movie.description}"></textarea>
                                </div>
                            </div>
                                
                            <div class="field">
                                <div class="control">
                                    <button class="button is-primary">
                                        <span class="icon is-small">
                                            <i class="fas fa-check"></i>
                                        </span>
                                        <span>
                                            Actualizar
                                        </span>
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="column"></div>
            </div>
        </div>
                        
                        
                        
                        
                        
                        
    </body>
</html>
