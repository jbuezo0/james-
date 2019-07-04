<%-- 
    Document   : Create_movie
    Created on : 7/06/2019, 09:30:48 PM
    Author     : JBuezo
--%>
<%@page import="com.models.Category"%>
<%@page import="com.dao.CategoryDao"%>
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
                <form method="post" action="CreateMovie">
                    <h1 class="title is-4">Nueva Pelicula</h1>

                    <div class="field">
                        <label class="label">Nombre</label>
                        <div class="control">
                            <input name="name_movie" class="input" type="text" placeholder="Estrenos">
                        </div>
                    </div>

                    <div class="field">
                        <label class="label">Duracion</label>
                        <div class="control">
                            <input name="duration" class="input" type="text" placeholder="2h 50ms">
                        </div>
                    </div>
                    <div class="field">
                        <label class="label">Descripcion</label>
                        <div class="control">
                            <textarea   name="description" class="textarea" placeholder=" Hello world"></textarea>
                        </div>
                    </div>
                    
                    <div class="field">
                        <label class="label">Categoria</label>

                    <div class="select">
                        <%    CategoryDao uno = new CategoryDao();   %> 
                        <select name="category_id">
                            <%       for (Category id : uno.getAll()) {%>
                            <option value="<%= id.getId()%>"><%= id.getName_category()%></option> <% }  %>
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



