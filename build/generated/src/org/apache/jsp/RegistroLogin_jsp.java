package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistroLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"animated bounceInDown \">          \n");
      out.write("            <div class=\"container1\">                \n");
      out.write("                <span class=\"error animated tada\" id=\"msg\"></span>\n");
      out.write("                <form action=\"GuardarLogin1\" method=\"post\" class=\"box\">\n");
      out.write("\n");
      out.write("                    <h4>REGISTRARSE</h4>\n");
      out.write("                    <h5>Ingrese sus datos</h5>\n");
      out.write("\n");
      out.write("                    <input required=\"\" placeholder=\"Cédula\" type=\"text\" name=\"cedula\" onkeypress=\"return solonumeros(event)\">           \n");
      out.write("                    <input required=\"\" placeholder=\"Contraseña\" type=\"password\" name=\"contrasenia\">\n");
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                            <select class=\"estilpciones\" name=\"cargo\">\n");
      out.write("                                <option  values=\"usuario\"> Usuario </option>                            \n");
      out.write("                            </select> \n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\"  name=\"accion\" value=\"ACEPTAR\" class=\"btn1\"></a>\n");
      out.write("                    <a href=\"Login.jsp\" class=\"dnthave\">Regresar</a>             \n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <tr>\n");
      out.write("                <td></td>\n");
      out.write("            </tr>\n");
      out.write("            <div class=\"footer\">   \n");
      out.write("                <p class=\"mensaje\">");
out.print(request.getAttribute("msj"));
      out.write("</p>\n");
      out.write("                <span>By: <i class=\"fa\"></i>Alexandra</a></span>\n");
      out.write("            </div>\n");
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
