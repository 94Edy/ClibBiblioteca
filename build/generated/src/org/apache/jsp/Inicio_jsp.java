package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Inicio_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <nav class=\"navbar sticky-top navbar-light navbar-dark bg-dark\">\n");
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
      out.write("        <div class=\"card mb-3\" style=\"max-width:\">\n");
      out.write("            <div class=\"row g-0\">\n");
      out.write("                <div class=\"col-md-auto\">\n");
      out.write("                    <img src=\"VISTA/IMG/logo-biblioteca.png\" class=\"rounded float-start\" alt=\"\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>      \n");
      out.write("        <div class=\"container\"> \n");
      out.write("            <div id=\"carouselExampleDark\" class=\"carousel carousel-dark slide\" data-bs-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-indicators\">\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\n");
      out.write("                    <button type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\" data-bs-interval=\"2000\">\n");
      out.write("                        <img src=\"VISTA/IMG/imgcarousel1.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\" data-bs-interval=\"2000\">\n");
      out.write("                        <img src=\"VISTA/IMG/imgcarousel2.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\" data-bs-interval=\"2000\">\n");
      out.write("                        <img src=\"VISTA/IMG/imgcarousel3.jpg\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide=\"prev\">\n");
      out.write("                    <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"visually-hidden\">Anterior</span>\n");
      out.write("                </button>\n");
      out.write("                <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleDark\" data-bs-slide=\"next\">\n");
      out.write("                    <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                    <span class=\"visually-hidden\">Siguiente</span>\n");
      out.write("                </button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <label></label>\n");
      out.write("        <label></label>\n");
      out.write("        <div  class=\"sf_colsIn container\" data-sf-element=\"Container\" data-placeholder-label=\"Container\"><div class=\"row\" data-sf-element=\"Row\">\n");
      out.write("                <div  class=\"sf_colsIn col-md-1 empty\" data-sf-element=\"Column 1\" data-placeholder-label=\"Column 1\"></div>\n");
      out.write("                <div  class=\"sf_colsIn col-md-10\" data-sf-element=\"Column 2\" data-placeholder-label=\"Column 2\"><div class=\"row\" data-sf-element=\"Row\">\n");
      out.write("                        <div  class=\"sf_colsIn col-md-6\" data-sf-element=\"Column 1\" data-placeholder-label=\"Column 1\">\n");
      out.write("                            <div class=\"sf-content-block content-block\">\n");
      out.write("                                <div><p>\n");
      out.write("                                        La Biblioteca del Instituto Tecnologico Superior Nelson Torres es la biblioteca líder. Proporciona acceso a los conocimientos de las diferentes carreras que oferta, así como a otras fuentes de literatura científica producidas en todo el mundo. Los recursos y los conocimientos especializados de\n");
      out.write("                                        la Biblioteca del INT también proporcionan pruebas y conocimientos a los estudiantes de ingresos bajos y medianos a través de un conjunto de iniciativas de bajo costo/alto uso.</p>\n");
      out.write("                                    <p>Las redes y las asociaciones son un componente esencial para garantizar que nuestras iniciativas globales lleguen a un público mundial. Utilizando un conjunto de herramientas colaborativas, bibliotecarios y especialistas en información tienen una estrecha\n");
      out.write("                                        comprensión de las realidades del país y necesidades. Esto ayuda a mantener el enfoque en soluciones adecuadas y rentables de información y intercambio de conocimientos.</p><div><div data-class=\"more-content\" class=\"more-content\"><div data-class=\"more-content-inner\" class=\"more-content-inner\"><p>&nbsp;</p></div></div></div></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"sf_colsIn col-md-6\" data-sf-element=\"Column 2\" data-placeholder-label=\"Column 2\"><div class=\"row\" data-sf-element=\"Row\">\n");
      out.write("                                <div id=\"PageContent_C045_Col00\" class=\"sf_colsIn col-md-6\" data-sf-element=\"Column 1\" data-placeholder-label=\"Column 1\">\n");
      out.write("                                    <div class=\"sf-content-block content-block\">\n");
      out.write("                                        <div><h3>Información práctica</h3><p>(Actualmente cerrada)</p><p></p><p>Los\n");
      out.write("                                                visitantes necesitan concertar una cita para usar la biblioteca.<o:p></o:p></p><p>De lunes a viernes: </p><ul><li>15:00-19:00 (hora local)</li><li>20:00-22:00 (hora local)</li></ul></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div  class=\"sf_colsIn col-md-6\" data-sf-element=\"Column 2\" data-placeholder-label=\"Column 2\">\n");
      out.write("                                    <div class=\"sf-content-block content-block\">\n");
      out.write("                                        <div><h3>Contacto<o:p></o:p></h3><p>Biblioteca\n");
      out.write("                                                y Redes de Información para el Conocimiento<br>Instituto Nelson Torres <br>Cayambe<br>Pichincha<br>Ecuador<br>Tel.: +41(0)22 791 2062<br>Fax: +41(0)22 791 4150<br>\n");
      out.write("                                            </p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"sf-content-block content-block\">\n");
      out.write("                        <div><p></p></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
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
