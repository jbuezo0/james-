<%-- 
    Document   : login
    Created on : 15/06/2019, 11:04:31 PM
    Author     : JBuezo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Regístrate</title>
            <link rel="stylesheet" href="css/bulma.css">
            <link rel="stylesheet" href="css/custom.css">
            <link rel="stylesheet" href="css/style.css">
            <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
            <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet' type='text/css'>
        </head>

        <body>


            <div class='login'>

	<form class="form" id="form" method="get" action="CreateListUser">

                <h2>Login</h2>
                <input name='name' placeholder='Username' type='text'>
                <input id='pw' name='pass' placeholder='Password' type='password'>
                <div class='agree'>
                </div>
                <input class='animated' type='submit' value='OK..'>
                <a class='forgot' href='login_user.jsp'>Boos</a>
                <a class='forgot' href='MovieList'>Incio</a>
            </div>

                       </form>

       
       
       
       
       
       <c:forEach items="${list}" var="usuario">
                <p>${usuario.user_name}
                   




                </p>
            </c:forEach> 
    </body>
</html>
      