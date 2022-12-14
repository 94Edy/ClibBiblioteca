<%-- 
    Document   : RegistroUsuarios
    Created on : 14/09/2022, 0:44:16
    Author     : USUARIO
--%>

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

        <div class="slogan distanciatop">REGISTRO USUARIO</div><br>
        <div class="container shadow-lg p-3 mb-5 bg-body p-2 text-dark bg-opacity-25 distanciatop">

            <form action="GuardarUsuario" method="post" class="row g-3 ">
                <table class="table2">
                    <tr>
                        <td class="td">
                            <img src="VISTA/IMG/guardar.png" alt=""/>
                            <input class="botoncrud" type="submit" name="accion" value="Guardar">                            
                        </td>
                        <td class="td">
                            <img src="VISTA/IMG/cancelar.jpg" alt=""/>
                            <input class="botoncrud" type="submit" name="accion" value="Cancelar"> 
                        </td>                      
                    </tr>
                </table>

                <div></div>                               
                <div class="col-md-4">
                    <label class="form-label">C??dula</label>
                    <input type="text" name="cedulaU" class="form-control" onkeypress="return solonumeros(event)">
                </div>
                <div class="col-md-4">
                    <label class="form-label">Nombres</label>
                    <input type="text" name="nombresU" class="form-control">
                </div>
                <div class="col-md-4">
                    <label class="form-label">Apellidos</label>
                    <input type="text" name="apellidosU" class="form-control">
                </div>
                <div class="col-md-4">
                    <label class="form-label">Correo</label>
                    <input type="email" name="correoU" class="form-control">
                </div>
                <div class="col-md-4">
                    <label class="form-label">Carrera</label>
                    <select name="fk_carreraId" class="form-select">
                        <option selected disabled value="">Elige...</option>
                        <option value="1" >Tecnolog??a Superior en Administraci??n</option>
                        <option value="2" >Tecnolog??a en Desarrollo de software</option>
                        <option value="3">Dise??o Gr??fico</option>
                        <option value="4">N/A</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label class="form-label">Nivel acad??mico</label>
                    <select name="fk_nivelAcademicoId" class="form-select">
                        <option selected disabled value="">Elige...</option>
                        <option value="1">Primero</option>
                        <option value="2">Segundo</option>
                        <option value="3">Tercero</option>
                        <option value="4">Cuarto</option>
                        <option value="5">Quinto</option>
                        <option value="6">N/A</option>
                    </select>
                </div>
                <div class="col-md-4">
                    <label class="form-label">Formaci??n acad??mica</label>
                    <select name="fk_formacionAcademicaId" class="form-select">
                        <option selected disabled value="">Elige...</option>
                        <option value="1">Estudiante</option>
                        <option value="2">Docente</option>
                        <option value="3">Usuario externo</option>
                        <option value="4">Primaria</option>
                        <option value="5">Secundaria</option>
                        <option value="6">Superior</option>
                        <option value="7">N/A</option>
                    </select>
                </div>                        
            </form>
        </div>  
    </body>
</html>
