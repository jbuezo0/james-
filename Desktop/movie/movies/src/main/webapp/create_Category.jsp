<%-- 
    Document   : create_Category
    Created on : 5/06/2019, 11:30:18 AM
    Author     : JBuezo
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <form method="post" action="CreateCategoria">
                    <h1 class="title is-4">Nueva Categoria</h1>

                    <div class="field">
                        <label class="label">Nombre</label>
                        <div class="control">
                            <input name="name" class="input" type="text" placeholder="Category">
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
