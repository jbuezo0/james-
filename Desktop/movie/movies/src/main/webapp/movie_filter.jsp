<%-- 
    Document   : movie_filter
    Created on : 22/06/2019, 12:35:20 AM
    Author     : JBuezo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>         
            
            <!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>cover pelicula</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="css/bulma.css">
        <link type="text/css" rel="stylesheet" href="css/estilos.css">
        <link type="text/css" rel="stylesheet" href="css/style.css">
                <%@include file="tem/navbar.jsp"%>    

</head>

<body>
    
       <c:forEach items="${Movie}" var="mov">

    <div class="banner" style="background-image: url(img/bar/bar${mov.id}.jpg);">
      
  <div class="cover">
      
    <div class="cover__container">
        
      
        
             <div class="cover__image">
          
        <img src="img/${mov.id}.jpg" alt="">
      </div>
      
      
      <div class="cover__information">
        <div class="cover__title">
          <h1>${mov.name_movie}</h1>
        </div>
        <div class="cover__description">
            
            ${mov.description}
          
             <div class="cover__descriptionb">
                 ${mov.duration}</div>
            
       <a class="button is-warning is-rounded" onClick="location.href = 'CategoryFilter?marca=${mov.categorymovie}&id=${mov.id}'">${mov.categorymovie}</a>
        </div>
 
</div>
            
    </div>
  </div></div>
  </div></div>
 <p class="red-button"class="solo-especiales">GALERIA DE RECUENTOS</p
</div>
    </div>


<div class="columns is-multiline">
  <div class="column is-one-quarter-desktop is-half-tablet">
    <div class="card">
        <div class="card-image">
            <figure class="image is-3by2">
              <img src="img/gale/a${mov.id}.jpg" alt="">
            </figure>
            
        </div>
        
    </div>
  </div>
  <div class="column is-one-quarter-desktop is-half-tablet">
    <div class="card">
        <div class="card-image">
            <figure class="image is-3by2">
              <img src="img/gale/b${mov.id}.jpg" alt="">
            </figure>
            
        </div>
       
    </div>
  </div>  
  <div class="column is-one-quarter-desktop is-half-tablet">
    <div class="card">
        <div class="card-image">
            <figure class="image is-3by2">
              <img src="img/gale/c${mov.id}.jpg" alt="">
            </figure>
            
        </div>
        
    </div>
  </div>
  <div class="column is-one-quarter-desktop is-half-tablet">
    <div class="card">
        <div class="card-image">
            <figure class="image is-3by2">
              <img src="img/gale/d${mov.id}.jpg" alt="">
            </figure>
                    </div>
        
    </div>
  </div>
 
</div>
                         </c:forEach>
    
 
    </body>
</html>