<%-- 
    Document   : Inicio
    Created on : 14/09/2022, 0:35:08
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
                        <a class="nav-link" href="ListadoPrestamos.jsp">Préstamos</a>
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
        <div class="container"> 
            <div id="carouselExampleDark" class="carousel carousel-dark slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="1" aria-label="Slide 2"></button>
                    <button type="button" data-bs-target="#carouselExampleDark" data-bs-slide-to="2" aria-label="Slide 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active" data-bs-interval="2000">
                        <img src="VISTA/IMG/imgcarousel1.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                        </div>
                    </div>
                    <div class="carousel-item" data-bs-interval="2000">
                        <img src="VISTA/IMG/imgcarousel2.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                        </div>
                    </div>
                    <div class="carousel-item" data-bs-interval="2000">
                        <img src="VISTA/IMG/imgcarousel3.jpg" class="d-block w-100" alt="...">
                        <div class="carousel-caption d-none d-md-block">
                        </div>
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Anterior</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleDark" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Siguiente</span>
                </button>
            </div>
        </div>
        <label></label>
        <label></label>
        <div  class="sf_colsIn container" data-sf-element="Container" data-placeholder-label="Container"><div class="row" data-sf-element="Row">
                <div  class="sf_colsIn col-md-1 empty" data-sf-element="Column 1" data-placeholder-label="Column 1"></div>
                <div  class="sf_colsIn col-md-10" data-sf-element="Column 2" data-placeholder-label="Column 2"><div class="row" data-sf-element="Row">
                        <div  class="sf_colsIn col-md-6" data-sf-element="Column 1" data-placeholder-label="Column 1">
                            <div class="sf-content-block content-block">
                                <div><p>
                                        La Biblioteca del Instituto Tecnologico Superior Nelson Torres es la biblioteca líder. Proporciona acceso a los conocimientos de las diferentes carreras que oferta, así como a otras fuentes de literatura científica producidas en todo el mundo. Los recursos y los conocimientos especializados de
                                        la Biblioteca del INT también proporcionan pruebas y conocimientos a los estudiantes de ingresos bajos y medianos a través de un conjunto de iniciativas de bajo costo/alto uso.</p>
                                    <p>Las redes y las asociaciones son un componente esencial para garantizar que nuestras iniciativas globales lleguen a un público mundial. Utilizando un conjunto de herramientas colaborativas, bibliotecarios y especialistas en información tienen una estrecha
                                        comprensión de las realidades del país y necesidades. Esto ayuda a mantener el enfoque en soluciones adecuadas y rentables de información y intercambio de conocimientos.</p><div><div data-class="more-content" class="more-content"><div data-class="more-content-inner" class="more-content-inner"><p>&nbsp;</p></div></div></div></div>
                            </div>
                        </div>
                        <div class="sf_colsIn col-md-6" data-sf-element="Column 2" data-placeholder-label="Column 2"><div class="row" data-sf-element="Row">
                                <div id="PageContent_C045_Col00" class="sf_colsIn col-md-6" data-sf-element="Column 1" data-placeholder-label="Column 1">
                                    <div class="sf-content-block content-block">
                                        <div><h3>Información práctica</h3><p>(Actualmente cerrada)</p><p></p><p>Los
                                                visitantes necesitan concertar una cita para usar la biblioteca.<o:p></o:p></p><p>De lunes a viernes: </p><ul><li>15:00-19:00 (hora local)</li><li>20:00-22:00 (hora local)</li></ul></div>
                                    </div>
                                </div>
                                <div  class="sf_colsIn col-md-6" data-sf-element="Column 2" data-placeholder-label="Column 2">
                                    <div class="sf-content-block content-block">
                                        <div><h3>Contacto<o:p></o:p></h3><p>Biblioteca
                                                y Redes de Información para el Conocimiento<br>Instituto Nelson Torres <br>Cayambe<br>Pichincha<br>Ecuador<br>Tel.: +41(0)22 791 2062<br>Fax: +41(0)22 791 4150<br>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="sf-content-block content-block">
                        <div><p></p></div>
                    </div>
                </div>
            </div>
        </div>


    </body>
</html>
