/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlets;

import com.clases.Pedido;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.webservices.DulceReal_Service;
import java.io.IOException;
import java.io.PrintWriter;
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
 * @author Administrator
 */
public class ServletLoginAdm extends HttpServlet {
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
        String usuario = request.getParameter("usuarioAdm");
        String clave = request.getParameter("clave");
        
        if(loguearVendedor(usuario, clave)==true){
            ses.setAttribute("admin", usuario);
            
            String listaPedidos = conseguirPedidos();
            System.out.println(listaPedidos);
            Gson gson = new Gson();
            List<Pedido> pedidos = gson.fromJson(listaPedidos, new TypeToken<List<Pedido>>(){}.getType());

            ses.setAttribute("pedidos", pedidos);
            RequestDispatcher rd = request.getRequestDispatcher("verPedidos.jsp");
            rd.forward(request, response);
                
        }
        
        /*
        public void conseguirPedidos(){
        List<Pedido> listaPedidos = new ArrayList<Pedido>();
        Connection con=DBConexion.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String sql="SELECT nombreProducto, precioProducto, idproducto FROM tablapedidos";
        try {
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){               
                Pedido p = new Pedido(rs.getString(1), rs.getFloat(2), rs.getInt(3));
                listaProductos.add(p);
            }
            rs.close();
        } catch (SQLException ex) {                        
        }
        String pedidos=new Gson().toJson(listaPedidos);
        return pedidos;
        }
        */
        
        //TODO: WS que llame a todos los pedidos de la BD
        //TODO: WS que, a partir de un id de pedido, llamar a todas las ventas correspondientes a ese pedido
        //TODO: WS que llame todos los pedidos de un determinado cliente, usando su usuario del cliente
        //TODO: WS para validar login de administrador.
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

    private String cargarABaseDeDatos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.cargarABaseDeDatos();
    }

    private boolean loguearVendedor(java.lang.String usuarioAdm, java.lang.String clave) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.loguearVendedor(usuarioAdm, clave);
    }

    private String conseguirPedidos() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.webservices.DulceReal port = service.getDulceRealPort();
        return port.conseguirPedidos();
    }

    
    
}
