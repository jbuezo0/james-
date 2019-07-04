<%-- 
    Document   : navbar
    Created on : 17/06/2019, 10:02:32 PM
    Author     : JBuezo
--%>

<nav class="navbar is-dark" role="navigation" aria-label="main navigation">
  <div class="navbar-brand">
    <a class="navbar-item" href="MovieList">
                        <p class='title is-2 has-text-white'>TopMovie</p>

    </a>

    <a role="button" class="navbar-burger burger" aria-label="menu" aria-expanded="false" data-target="navbarBasicExample">
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
      <span aria-hidden="true"></span>
    </a>
  </div>

  <div id="navbarBasicExample" class="navbar-menu">
    <div class="navbar-start">
      <a href="MovieList"class="navbar-item">
        Peliculas
      </a>

      <a href="GeneroList" class="navbar-item">
        Categoria
      </a>

     

        <a href="FunctionsList" class="navbar-item">
        Funciones
      </a>

      
      </div>
    </div>

    <div class="navbar-end">
      <div class="navbar-item">
        <div class="buttons">
          <a href="login.jsp"  class="button is-primary">
            <strong>Employee</strong>
          </a>
          <a href="login_user.jsp" class="button is-light">
            Boos
          </a>
        </div>
      </div>
    </div>
  </div>
</nav>

