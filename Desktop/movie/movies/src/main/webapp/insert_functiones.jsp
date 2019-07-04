<%-- 
    Document   : insert_functiones
    Created on : 15/06/2019, 11:51:58 AM
    Author     : JBuezo
--%>
<%@page import="com.models.Movie"%>
<%@page import="com.models.Usuario"%>
<%@page import="com.dao.MovieDao"%>
<%@page import="com.dao.UsuarioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="tem/nab.jsp"%>   
<link rel="stylesheet" href="css/bulma.css">


<div class="hero is-light is-fullheight">
    <div class="columns">
        <div class="column is-flex is-vcentered">
            <div class="section">
                <%@include file='tem/menu.jsp'%>
            </div>
        </div>
        <div class="column is-trhee-quarters is-vcentered"><br><br><br>
            <div class="box">
                    <form action="CreateFunctiones" method="post">
                    <h1 class="title is-4">Nueva Funcion</h1>

                    <div class="field">
                        <label class="label">Clasificacion</label>
                        <div class="control">
                            <input name="classification" class="input" type="text" placeholder="B13">
                        </div>
                    </div>

                    <div class="field">
                        <label class="label">Estreno</label>
                        <div class="control">
                            <input name="premiere" class="input" type="date" placeholder="20/01/2019">
                        </div>
                    </div>
                    <div class="field">
                        <label class="label">Hora</label>
                        <div class="control">
                            <input name="hour" class="input" type="text" placeholder="5:30PM">
                        </div>
                    </div>

                    <div class="field">
                        <label class="label">Pelicula</label>

                        <div class="select">
                         <%      MovieDao dos = new MovieDao();%>
                            <select name="movie_id">
                                <%                   for (Movie id : dos.getAll()) {%>
                                <option value="<%= id.getId()%>"><%= id.getName_movie()%></option><% }  %>
                            </select>
                        </div>
                    </div>

                    <div class="field">
                        <div class="control">
                            <button class="button is-primary">
                                <span class="icon is-small">
                                    <i class="fas fa-check"></i>
                                </span>
                                <span>
                                    Submit
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
