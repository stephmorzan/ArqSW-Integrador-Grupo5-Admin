/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.clases.Venta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.webservices.CargarABaseDeDatos;
import com.webservices.DulceReal_Service;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author EQ
 */
public class ServletDetallarPedido extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/TrabajoIntegradorWS/dulceReal.wsdl")
    private DulceReal_Service service;

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
        
        HttpSession ses = request.getSession(true);
        String usuario=request.getParameter("admin");
        String id = request.getParameter("id");
        System.out.println(id);
        int idpedido = Integer.parseInt(id);
        String listaVentas = conseguirVentas(idpedido);
        List<Venta> ventas = new Gson().fromJson(listaVentas, new TypeToken<List<Venta>>(){}.getType());
        ses.setAttribute("admin", usuario);
        ses.setAttribute("ventas", ventas);
        for(Venta v: ventas){
            System.out.println(v.idventa);
        }
        RequestDispatcher rd = request.getRequestDispatcher("detallePedido.jsp");
        rd.forward(request, response);
        
        
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
        processRequest(request, response);
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

    private String conseguirVentas(java.lang.Integer idpedido) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.conseguirVentas(idpedido);
    }

    private String cargarABaseDeDatos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.cargarABaseDeDatos();
    }

    
    
}
