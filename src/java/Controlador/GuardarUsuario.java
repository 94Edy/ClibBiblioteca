/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
public class GuardarUsuario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GuardarUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GuardarUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int cedulaU, fk_carreraId, fk_nivelAcademicoId, fk_formacionAcademicaId, res;
        String msj, nombresU, apellidosU, correoU, accion;
        //zona de captura de datos
        accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Guardar")) {
            cedulaU = Integer.parseInt(request.getParameter("cedulaU"));
            nombresU = request.getParameter("nombresU");
            apellidosU = request.getParameter("apellidosU");
            correoU = request.getParameter("correoU");
            fk_carreraId = Integer.parseInt(request.getParameter("fk_carreraId"));
            fk_nivelAcademicoId = Integer.parseInt(request.getParameter("fk_nivelAcademicoId"));
            fk_formacionAcademicaId = Integer.parseInt(request.getParameter("fk_formacionAcademicaId"));
            msj = guardarUsuario(cedulaU, nombresU, apellidosU, correoU, fk_carreraId, fk_nivelAcademicoId, fk_formacionAcademicaId);
            // msj= cedulaagrgar(cedula1) ;
            request.setAttribute("msj", msj);//contenedor que va la resulatdo de una capa a otra
            //request.setAttribute("cedula",res);//contenedor que va la resulatdo de una capa a otra
            RequestDispatcher rp = request.getRequestDispatcher("ListadoUsuarios.jsp"); //cambia de pantalla index
            rp.forward(request, response);
        } else if (accion.equalsIgnoreCase("Cancelar")) {
            RequestDispatcher rp = request.getRequestDispatcher("ListadoUsuarios.jsp"); //cambia de pantalla index
            rp.forward(request, response);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private static String guardarUsuario(int cedulaU, java.lang.String nombresU, java.lang.String apellidosU, java.lang.String correoU, int fkCarreraId, int fkNivelAcademicoId, int fkFormacionAcademicaId) {
        modelo.Servicios_Service service = new modelo.Servicios_Service();
        modelo.Servicios port = service.getServiciosPort();
        return port.guardarUsuario(cedulaU, nombresU, apellidosU, correoU, fkCarreraId, fkNivelAcademicoId, fkFormacionAcademicaId);
    }
}