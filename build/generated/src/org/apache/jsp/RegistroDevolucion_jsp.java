package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroDevolucion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"VISTA/BOOTSTRAP/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js\" integrity=\"sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<body class=\"background-color bg-secondary bg-opacity-10\">\n");
      out.write("\n");
      out.write("     <nav class=\"navbar sticky-top navbar-light navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container-fluid \">                     \n");
      out.write("                <ul class=\"nav\">\n");
      out.write("                    <li class=\"nav-item dropdown\">\n");
      out.write("                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarScrollingDropdown\" \n");
      out.write("                           role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> \n");
      out.write("                            <img src=\"VISTA/IMG/usuario.png\" alt=\"\"width=\"40\" height=\"30\" class=\"d-inline-block align-text-top\">\n");
      out.write("                        </a>                     \n");
      out.write("                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarScrollingDropdown\">\n");
      out.write("                            <li><a class=\"dropdown-item\" href=\"index.jsp\">Cerrar sesion</a></li>\n");
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
      out.write("\n");
      out.write("        <div class=\"slogan distanciatop\">REGISTRO DEVOLUCIÓN</div><br>\n");
      out.write("        <div class=\"container shadow-lg p-3 mb-5 bg-body p-2 text-dark bg-opacity-25 distanciatop\">\n");
      out.write("\n");
      out.write("            <form action=\"GuardarDevolucion\" method=\"post\" class=\"row g-3 \">\n");
      out.write("                <table class=\"table2\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"td\">\n");
      out.write("                            <img src=\"VISTA/IMG/guardar.png\" alt=\"\"/>\n");
      out.write("                            <input class=\"botoncrud\" type=\"submit\" name=\"accion\" value=\"Guardar\">                            \n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"td\">\n");
      out.write("                            <img src=\"VISTA/IMG/cancelar.jpg\" alt=\"\"/>\n");
      out.write("                            <input class=\"botoncrud\" type=\"submit\" name=\"accion\" value=\"Cancelar\"> \n");
      out.write("                        </td>                      \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Id Préstamo</label>\n");
      out.write("                    <input type=\"text\" name=\"pk_prestamosId\"value=\"");
out.print(request.getAttribute("pk_prestamosId"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Fecha Préstamo</label>\n");
      out.write("                    <input type=\"date\" name=\"fechaPrestamo\"value=\"");
out.print(request.getAttribute("fechaPrestamo"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Fecha Devolución</label>\n");
      out.write("                    <input type=\"date\" name=\"fechaDevolucion\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h3>Datos del Usuario</h3>\n");
      out.write("                </div>      \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Id Usuario</label>\n");
      out.write("                    <input type=\"text\" name=\"pkUsuarioId\" value=\"");
out.print(request.getAttribute("pkUsuarioId"));
      out.write("\" class=\"form-control\" onkeypress=\"return solonumeros(event)\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Cédula</label>\n");
      out.write("                    <input type=\"text\" name=\"cedulaU\" value=\"");
out.print(request.getAttribute("cedulaU"));
      out.write("\" class=\"form-control\" onkeypress=\"return solonumeros(event)\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Nombres</label>\n");
      out.write("                    <input type=\"text\" name=\"nombresU\" value=\"");
out.print(request.getAttribute("nombresU"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Apellidos</label>\n");
      out.write("                    <input type=\"text\" name=\"apellidosU\" value=\"");
out.print(request.getAttribute("apellidosU"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Correo</label>\n");
      out.write("                    <input type=\"email\" name=\"correoU\" value=\"");
out.print(request.getAttribute("correoU"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Carrera</label>\n");
      out.write("                    <input type=\"text\" name=\"carreraId\" value=\"");
out.print(request.getAttribute("carreraId"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Nivel Académico</label>\n");
      out.write("                    <input type=\"text\" name=\"nivelAcademico\" value=\"");
out.print(request.getAttribute("nivelAcademicoId"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Formación Académica</label>\n");
      out.write("                    <input type=\"text\" name=\"formacionAcademica\" value=\"");
out.print(request.getAttribute("formacionAcademicaId"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <h3>Datos del Libro</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Id Libro</label>\n");
      out.write("                    <input type=\"text\" name=\"pkLibroId\" value=\"");
out.print(request.getAttribute("pkLibroId"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Código</label>\n");
      out.write("                    <input type=\"text\" name=\"codigoM\" value=\"");
out.print(request.getAttribute("codigoM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Autor</label>\n");
      out.write("                    <input type=\"text\" name=\"autorM\" value=\"");
out.print(request.getAttribute("autorM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Edición</label>\n");
      out.write("                    <input type=\"text\" name=\"edicionM\" value=\"");
out.print(request.getAttribute("edicionM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Año de publicación</label>\n");
      out.write("                    <input type=\"text\" name=\"anioPublicacionM\" value=\"");
out.print(request.getAttribute("anioPublicacionM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Título</label>\n");
      out.write("                    <input type=\"text\" name=\"tituloM\" value=\"");
out.print(request.getAttribute("tituloM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Ciudad</label>\n");
      out.write("                    <input type=\"text\" name=\"ciudadM\" value=\"");
out.print(request.getAttribute("ciudadM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">País</label>\n");
      out.write("                    <input type=\"text\" name=\"paisM\" value=\"");
out.print(request.getAttribute("paisM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Editorial</label>\n");
      out.write("                    <input type=\"text\" name=\"editorialM\" value=\"");
out.print(request.getAttribute("editorialM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Registro ISBN</label>\n");
      out.write("                    <input type=\"text\" name=\"registroISBNM\" value=\"");
out.print(request.getAttribute("registroISBNM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Nro de páginas</label>\n");
      out.write("                    <input type=\"text\" name=\"nroPaginasM\" value=\"");
out.print(request.getAttribute("nroPaginasM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Estado</label>\n");
      out.write("                    <input type=\"text\" name=\"nroPaginasM\" value=\"");
out.print(request.getAttribute("estadoM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Nro de ejemplares</label>\n");
      out.write("                    <input type=\"text\" name=\"nroEjemplaresM\" value=\"");
out.print(request.getAttribute("nroEjemplaresM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Incluye CD</label>\n");
      out.write("                    <input type=\"text\" name=\"nroEjemplaresM\" value=\"");
out.print(request.getAttribute("incluyeCd"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Tipo</label>\n");
      out.write("                    <input type=\"text\" name=\"tipoM\"  value=\"");
out.print(request.getAttribute("tipoM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Tiempo de vigencia</label>\n");
      out.write("                    <input type=\"text\" name=\"tiempoVigenciaM\" value=\"");
out.print(request.getAttribute("tiempoVigenciaM"));
      out.write("\" class=\"form-control\" readonly>\n");
      out.write("                </div>                           \n");
      out.write("            </form>\n");
      out.write("        </div> \n");
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
