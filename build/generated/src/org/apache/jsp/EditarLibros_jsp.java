package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditarLibros_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body class=\"background-color bg-secondary bg-opacity-10\">\n");
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
      out.write("        <div class=\"slogan distanciatop\">ACTUALIZAR LIBRO</div><br>\n");
      out.write("        <div class=\"container shadow-lg p-3 mb-5 bg-body p-2 text-dark bg-opacity-25 distanciatop\">\n");
      out.write("\n");
      out.write("            <form action=\"EditarLibro\" method=\"post\" class=\"row g-3 \">\n");
      out.write("                <table class=\"table2\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"td\">\n");
      out.write("                            <img src=\"VISTA/IMG/guardar.png\" alt=\"\"/>\n");
      out.write("                           \n");
      out.write("                            <input class=\"botoncrud\" type=\"submit\" name=\"accion\" value=\"Guardar\">                            \n");
      out.write("                        </td>\n");
      out.write("                        <td class=\"td\">\n");
      out.write("                            <img src=\"VISTA/IMG/cancelar.jpg\" alt=\"\"/>\n");
      out.write("                            <input class=\"botoncrud\" type=\"submit\" name=\"accion\" value=\"Cancelar\"> \n");
      out.write("                        </td>                      \n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("                <div></div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Id Libro</label>\n");
      out.write("                    <input type=\"text\" name=\"pkLibroId\"  class=\"form-control\" value=\"");
out.print(request.getAttribute("pkLibroId"));
      out.write("\" onkeypress=\"return solonumeros(event)\" readonly>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Código</label>\n");
      out.write("                    <input type=\"text\" name=\"codigoM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("codigoM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Autor</label>\n");
      out.write("                    <input type=\"text\" name=\"autorM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("autorM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Edición</label>\n");
      out.write("                    <input type=\"text\" name=\"edicionM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("edicionM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Año de publicación</label>\n");
      out.write("                    <input type=\"text\" name=\"anioPublicacionM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("anioPublicacionM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Título</label>\n");
      out.write("                    <input type=\"text\" name=\"tituloM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("tituloM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Ciudad</label>\n");
      out.write("                    <input type=\"text\" name=\"ciudadM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("ciudadM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">País</label>\n");
      out.write("                    <input type=\"text\" name=\"paisM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("paisM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Editorial</label>\n");
      out.write("                    <input type=\"text\" name=\"editorialM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("editorialM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Registro ISBN</label>\n");
      out.write("                    <input type=\"text\" name=\"registroISBNM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("registroISBNM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Nro de páginas</label>\n");
      out.write("                    <input type=\"text\" name=\"nroPaginasM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("nroPaginasM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Estado</label>\n");
      out.write("                    <select name=\"estadoM\" class=\"form-select\">\n");
      out.write("                        <option value=\"");
out.print(request.getAttribute("estadoM"));
      out.write("\">  ");
out.print(request.getAttribute("estadoM"));
      out.write("</option>\n");
      out.write("                        <option value=\"bueno\">Bueno</option>\n");
      out.write("                        <option value=\"malo\">Malo</option>\n");
      out.write("                        <option value=\"regular\">Regular</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Nro de ejemplares</label>\n");
      out.write("                    <input type=\"text\" name=\"nroEjemplaresM\"  class=\"form-control\" value=\"");
out.print(request.getAttribute("nroEjemplaresM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Incluye CD</label>\n");
      out.write("                    <select name=\"incluyeCd\" class=\"form-select\">\n");
      out.write("                        <option value=\"");
out.print(request.getAttribute("incluyeCd"));
      out.write("\">  ");
out.print(request.getAttribute("incluyeCd"));
      out.write("</option>\n");
      out.write("                        <option value=\"si\">Si</option>\n");
      out.write("                        <option value=\"no\">No</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Tipo</label>\n");
      out.write("                    <input type=\"text\" name=\"tipoM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("tipoM"));
      out.write("\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <label class=\"form-label\">Tiempo de vigencia</label>\n");
      out.write("                    <input type=\"text\" name=\"tiempoVigenciaM\" class=\"form-control\" value=\"");
out.print(request.getAttribute("tiempoVigenciaM"));
      out.write("\">\n");
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
