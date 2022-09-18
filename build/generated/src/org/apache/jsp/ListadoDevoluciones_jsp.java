package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import modelo.User;
import user.UserService;
import user.UserService;

public final class ListadoDevoluciones_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"VISTA/BOOTSTRAP/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"background-color bg-secondary bg-opacity-10\">\n");
      out.write("\n");
      out.write("        <nav class=\"navbar sticky-top navbar-light navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container-fluid \">                     \n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarScrollingDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">Mi Perfil</a>                     \n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"index.jsp\">Salir</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active\" href=\"Inicio.jsp\">Inicio</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"ListadoUsuarios.jsp\">Usuarios</a>\n");
      out.write("                    </li>                          \n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"ListadoLibros.jsp\">Libros</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"ListadoPrestamos.jsp\">Préstamos</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"ListadoDevoluciones.jsp\">Devoluciones</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"card mb-3\" style=\"max-width:\">\n");
      out.write("            <div class=\"row g-0\">\n");
      out.write("                <div class=\"col-md-auto\">\n");
      out.write("                    <img src=\"VISTA/IMG/logo-biblioteca.png\" class=\"rounded float-start\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"slogan distanciatop\">DEVOLUCIONES</div><br>\n");
      out.write("        <div class=\"container shadow-lg p-3 mb-5 bg-body p-2 text-dark bg-opacity-25 distanciatop\">\n");
      out.write("\n");
      out.write("            <form action=\"CrudDevolucion\" method=\"post\">   \n");
      out.write("              <table class=\"table2\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"td\">\n");
      out.write("                            <img src=\"VISTA/IMG/nuevo.jpg\" alt=\"\"/>\n");
      out.write("                            <input class=\"botoncrud\" type=\"submit\" name=\"accion\" value=\"Nuevo\">                            \n");
      out.write("                        </td>                                                                               \n");
      out.write("                        <td class=\"td\">\n");
      out.write("                            <img src=\"VISTA/IMG/buscar.jpg\" alt=\"\"/>\n");
      out.write("                            <input class=\"cedula\" placeholder=\"ID USUARIO\" type=\"text\" name=\"pkUsuarioId\" onkeypress=\"return solonumeros(event)\"> \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <table class=\"table1\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"td\" colspan=\"\">\n");
      out.write("                            <p class=\"mensaje\">");
out.print(request.getAttribute("msj"));
      out.write("</p>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>                  \n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div class=\"table-responsive overflow-scroll divtabla\">\n");
      out.write("                    <table class=\"table caption-top\">\n");
      out.write("                        <caption>Lista de Devoluciones</caption>\n");
      out.write("                        <thead>\n");
      out.write("                            <tr class=\"table-secondary\">\n");
      out.write("                                <th>ID DEVOLUCIÓN</th>\n");
      out.write("                                <th>FECHA DEVOLUCIÓN</th>\n");
      out.write("                                <th>FECHA PRÉSTAMO</th>\n");
      out.write("                                <th>ID USUARIO</th>\n");
      out.write("                                <th>CÉDULA</th>\n");
      out.write("                                <th>NOMBRES</th>\n");
      out.write("                                <th>APELLIDOS</th>\n");
      out.write("                                <th>CORREO</th>\n");
      out.write("                                <th>CARRERA</th>\n");
      out.write("                                <th>NIVEL ACADÉMICO</th>\n");
      out.write("                                <th>FORMACIÓN ACADÉMICA</th>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>CÓDIGO</th>\n");
      out.write("                                <th>AUTOR</th>\n");
      out.write("                                <th>EDICIÓN</th>\n");
      out.write("                                <th>AÑO PUBLICACIÓN</th>\n");
      out.write("                                <th>TÍTULO</th>\n");
      out.write("                                <th>CIUDAD</th>\n");
      out.write("                                <th>PAÍS</th>\n");
      out.write("                                <th>EDITORIAL</th>\n");
      out.write("                                <th>REGISTRO ISBN</th>\n");
      out.write("                                <th>NRO PÁGINAS</th>\n");
      out.write("                                <th>ESTADO</th>\n");
      out.write("                                <th>NRO EJEMPLARES</th>\n");
      out.write("                                <th>INCLUYE CD</th>\n");
      out.write("                                <th>TIPO</th>\n");
      out.write("                                <th>TIEMPO VIGENCIA</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                          ");

                              UserService user = new UserService();
                              List<User> datos = user.listarDevoluciones();
                              for (User u : datos) {
                            
      out.write(" \n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print( u.getPkDevolucionesId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getFechaDevolucion());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getFechaPrestamo());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getPkUsuariosId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getCedulaU());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getNombresU());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getApellidosU());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getCorreoU());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getCarreraId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getNivelAcademicoId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getFormacionAcademicaId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getPkLibrosId());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getCodigoM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getAutorM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getEdicionM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getAnioPublicacionM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getTituloM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getCiudadM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getPaisM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getEditorialM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getRegistroISBNM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getNroPaginasM());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print( u.getEstadoM());
      out.write("</td>  \n");
      out.write("                                <td>");
      out.print( u.getNroEjemplaresM());
      out.write("</td> \n");
      out.write("                                <td>");
      out.print( u.getIncluyeCd());
      out.write("</td> \n");
      out.write("                                <td>");
      out.print( u.getTipoM());
      out.write("</td> \n");
      out.write("                                <td>");
      out.print( u.getTiempoVigenciaM());
      out.write("</td>\n");
      out.write("                            </tr> \n");
      out.write("                            ");
}
      out.write("   \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
