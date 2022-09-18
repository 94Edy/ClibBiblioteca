<%-- 
    Document   : Login
    Created on : 14/09/2022, 0:23:36
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="VISTA/BOOTSTRAP/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <script src="javascript/newjavascript.js" type="text/javascript"></script>
        <title>JSP Page</title>
    </head>
    <body class="background-color bg-secondary bg-opacity-10">       
        <div class="position-absolute top-50 start-50 translate-middle">
            <div class="shadow-lg p-2 mb-2 bg-body rounded">
                <div class="card mb-1" style="max-width: 600px;">
                    <div class="bg-secondary bg-opacity-25">
                        <div class="row g-0">
                            <div class="col-md-12">
                                <img src="VISTA/IMG/logo-biblioteca.png" class="rounded mx-auto d-block" alt="..."/>
                            </div>
                            <form action="Validar1" method="post" class="box">
                                <div class="mb-3 col-11 mx-auto"> 
                                    <input required="" placeholder="Cédula" type="text" name="cedula" onkeypress="return solonumeros(event)">           
                                </div>
                                <div class="mb-3 col-11 mx-auto">
                                    <input required="" placeholder="Contraseña" type="password" name="contrasenia">
                                </div>

                                <select class="mb-3 col-11 mx-auto" name="cargo">
                                    <option  values="Usuario"> Usuario </option>
                                    <option  values="Administrador"> Administrador</option>                             
                                </select> 

                                    <div class="d-grid gap-2 col-11 mx-auto">

                                        <button class="btn btn-dark" type="submit" name="accion"  >Acceder</button>
                                    </div>


                                <a href="RegistroLogin.jsp" class="dnthave">¿No tienes una cuenta? Registrarse</a>             
                                <div class="footer">   
                                    <p class="mensaje"><%out.print(request.getAttribute("msj"));%></p>

                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
