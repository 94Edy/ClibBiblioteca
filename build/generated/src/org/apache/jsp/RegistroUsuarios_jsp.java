package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <body class=\"background-color bg-secondary bg-opacity-10\">\n");
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
      out.write("\n");
      out.write("        <div class=\"slogan distanciatop\">REGISTRO USUARIO</div><br>\n");
      out.write("        <div class=\"container shadow-lg p-3 mb-5 bg-body p-2 text-dark bg-opacity-25 distanciatop\">\n");
      out.write("\n");
      out.write("            <form action=\"GuardarUsuario\" method=\"post\" class=\"row g-3 \">\n");
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
      out.write("\n");
      out.write("                <div></div>                               \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Cédula</label>\n");
      out.write("                    <input type=\"text\" name=\"cedulaU\" class=\"form-control\" onkeypress=\"return solonumeros(event)\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Nombres</label>\n");
      out.write("                    <input type=\"text\" name=\"nombresU\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Apellidos</label>\n");
      out.write("                    <input type=\"text\" name=\"apellidosU\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Correo</label>\n");
      out.write("                    <input type=\"email\" name=\"correoU\" class=\"form-control\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Carrera</label>\n");
      out.write("                    <select name=\"fk_carreraId\" class=\"form-select\">\n");
      out.write("                        <option selected disabled value=\"\">Elige...</option>\n");
      out.write("                        <option value=\"1\" >Tecnología Superior en Administración</option>\n");
      out.write("                        <option value=\"2\" >Tecnología en Desarrollo de software</option>\n");
      out.write("                        <option value=\"3\">Diseño Gráfico</option>\n");
      out.write("                        <option value=\"4\">N/A</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Nivel académico</label>\n");
      out.write("                    <select name=\"fk_nivelAcademicoId\" class=\"form-select\">\n");
      out.write("                        <option selected disabled value=\"\">Elige...</option>\n");
      out.write("                        <option value=\"1\">Primero</option>\n");
      out.write("                        <option value=\"2\">Segundo</option>\n");
      out.write("                        <option value=\"3\">Tercero</option>\n");
      out.write("                        <option value=\"4\">Cuarto</option>\n");
      out.write("                        <option value=\"5\">Quinto</option>\n");
      out.write("                        <option value=\"6\">N/A</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Formación académica</label>\n");
      out.write("                    <select name=\"fk_formacionAcademicaId\" class=\"form-select\">\n");
      out.write("                        <option selected disabled value=\"\">Elige...</option>\n");
      out.write("                        <option value=\"1\">Estudiante</option>\n");
      out.write("                        <option value=\"2\">Docente</option>\n");
      out.write("                        <option value=\"3\">Usuario externo</option>\n");
      out.write("                        <option value=\"4\">Primaria</option>\n");
      out.write("                        <option value=\"5\">Secundaria</option>\n");
      out.write("                        <option value=\"6\">Superior</option>\n");
      out.write("                        <option value=\"7\">N/A</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>                        \n");
      out.write("            </form>\n");
      out.write("        </div>  \n");
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
