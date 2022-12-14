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
public class GuardarDevolucion extends HttpServlet {

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
            out.println("<title>Servlet GuardarDevolucion</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GuardarDevolucion at " + request.getContextPath() + "</h1>");
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
        int fkPrestamoId;
        String fechaDevolucion, msj, accion;
         //zona de captura de datos
        accion = request.getParameter("accion");
        if (accion.equalsIgnoreCase("Guardar")) {  //si la accion es ignoranda la mayusculas y minusculas 
            fkPrestamoId = Integer.parseInt(request.getParameter("pk_prestamosId"));
            fechaDevolucion = request.getParameter("fechaDevolucion");  //encapsulando informacion de los inputs... asignado en variables para guardar en base de datos
            msj = guardarDevolucion(fechaDevolucion, fkPrestamoId);
            request.setAttribute("msj", msj);//contenedor que va la resulatdo de una capa a otra
            //request.setAttribute("cedula",res);//contenedor que va la resulatdo de una capa a otra
            RequestDispatcher rp = request.getRequestDispatcher("ListadoDevoluciones.jsp"); //cambia de pantalla index
            rp.forward(request, response);
        } else {
            RequestDispatcher rp = request.getRequestDispatcher("ListadoPrestamos.jsp"); //cambia de pantalla index
            rp.forward(request, response); //responde el servlet
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

    // insertando un webSwervis para el previo uso
    private static String guardarDevolucion(java.lang.String fechaDevolucion, int fkPrestamoId) {
        modelo.Servicios_Service service = new modelo.Servicios_Service();
        modelo.Servicios port = service.getServiciosPort();
        return port.guardarDevolucion(fechaDevolucion, fkPrestamoId);
    }

}
