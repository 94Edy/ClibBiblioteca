<%-- 
    Document   : ListadoLibros
    Created on : 14/09/2022, 0:39:31
    Author     : USUARIO
--%>

<%@page import="java.util.List"%>
<%@page import="modelo.User"%>
<%@page import="modelo.User"%>
<%@page import="user.UserService"%>
<%@page import="user.UserService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="VISTA/BOOTSTRAP/css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
        <title>JSP Page</title>
    </head>
    <body class="background-color bg-secondary bg-opacity-10">

        <nav class="navbar sticky-top navbar-light navbar-dark bg-dark">
            <div class="container-fluid ">                     
                <ul class="nav">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarScrollingDropdown" 
                           role="button" data-bs-toggle="dropdown" aria-expanded="false"> 
                            <img src="VISTA/IMG/usuario.png" alt=""width="40" height="30" class="d-inline-block align-text-top">
                        </a>                     
                        <ul class="dropdown-menu" aria-labelledby="navbarScrollingDropdown">
                            <li><a class="dropdown-item" href="index.jsp">Cerrar sesion</a></li>
                        </ul>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" href="Inicio.jsp">Inicio</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ListadoUsuarios.jsp">Usuarios</a>
                    </li>                          
                    <li class="nav-item">
                        <a class="nav-link" href="ListadoLibros.jsp">Libros</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ListadoPrestamos.jsp">Pr??stamos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="ListadoDevoluciones.jsp">Devoluciones</a>
                    </li>
                </ul>

            </div>
        </nav>
        <div class="card mb-3" style="max-width:">
            <div class="row g-0">
                <div class="col-md-auto">
                    <img src="VISTA/IMG/logo-biblioteca.png" class="rounded float-start" alt=""/>
                </div>
            </div>
        </div>

        <div class="slogan distanciatop">MATERIAL BIBLIOGR??FICO</div><br>
        <div class="container shadow-lg p-3 mb-5 bg-body p-2 text-dark bg-opacity-25 distanciatop" >
     
            <form action="CrudLibro" method="post">   
                <table class="table2">
                    <tr>
                        <td class="td">
                            <img src="VISTA/IMG/nuevo.jpg" alt=""/>
                            <input class="botoncrud" type="submit" name="accion" value="Nuevo">                            
                        </td>
                        <td class="td">
                            <img src="VISTA/IMG/editar.png" alt=""/>
                            <input class="botoncrud" type="submit" name="accion" value="Actualizar"> 
                        </td>
                        <td class="td">
                            <img src="VISTA/IMG/eliminar.png" alt=""/>
                            <input class="botoncrud" type="submit" name="accion" value="Eliminar">
                        </td>
                        <td class="td">
                            <img src="VISTA/IMG/buscar.jpg" alt=""/>
                            <input class="cedula" placeholder="ID" type="text" name="pkLibroId" onkeypress="return solonumeros(event)"> 
                        </td>

                    </tr>
                </table>
                <table class="table1">
                    <tr>
                        <td class="td">
                            <p class="mensaje"><%out.print(request.getAttribute("msj"));%></p>
                        </td>
                    </tr>                  
                </table>

                <div class="table-responsive overflow-scroll divtabla">
                    <table class="table table-striped">
                        <caption>Lista de libros</caption>
                        <thead>
                            <tr class="table-secondary">
                                <th>ID LIBRO</th>
                                <th>C??DIGO</th>
                                <th>AUTOR</th>
                                <th>EDICI??N</th>
                                <th>A??O PUBLICACI??N</th>
                                <th>T??TULO</th>
                                <th>CIUDAD</th>
                                <th>PA??S</th>
                                <th>EDITORIAL</th>
                                <th>REGISTRO ISBN</th>
                                <th>NRO P??GINAS</th>
                                <th>ESTADO</th>
                                <th>NRO EJEMPLARES</th>
                                <th>INCLUYE CD</th>
                                <th>TIPO</th>
                                <th>TIEMPO VIGENCIA</th>
                            </tr>
                        </thead>

                        <tbody>                          
                            <%
                                UserService user = new UserService();
                                List<User> datos = user.listarLibros();
                                for (User u : datos) {
                            %>
                            <tr>
                                <td><%= u.getPkLibrosId()%></td>
                                <td><%= u.getCodigoM()%></td>
                                <td><%= u.getAutorM()%></td>
                                <td><%= u.getEdicionM()%></td>
                                <td><%= u.getAnioPublicacionM()%></td>
                                <td><%= u.getTituloM()%></td>
                                <td><%= u.getCiudadM()%></td>
                                <td><%= u.getPaisM()%></td>
                                <td><%= u.getEditorialM()%></td>
                                <td><%= u.getRegistroISBNM()%></td>
                                <td><%= u.getNroPaginasM()%></td>
                                <td><%= u.getEstadoM()%></td>  
                                <td><%= u.getNroEjemplaresM()%></td> 
                                <td><%= u.getIncluyeCd()%></td> 
                                <td><%= u.getTipoM()%></td> 
                                <td><%= u.getTiempoVigenciaM()%></td>
                            </tr> 
                            <%}%> 
                        </tbody>
                    </table>
                </div>
            </form>
        </div>    
    </body>
</html>
