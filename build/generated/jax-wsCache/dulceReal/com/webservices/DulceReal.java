
package com.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "dulceReal", targetNamespace = "http://webservices.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DulceReal {


    /**
     * 
     * @param clave
     * @param usuarioAdm
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loguearVendedor", targetNamespace = "http://webservices.com/", className = "com.webservices.LoguearVendedor")
    @ResponseWrapper(localName = "loguearVendedorResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.LoguearVendedorResponse")
    @Action(input = "http://webservices.com/dulceReal/loguearVendedorRequest", output = "http://webservices.com/dulceReal/loguearVendedorResponse")
    public boolean loguearVendedor(
        @WebParam(name = "usuarioAdm", targetNamespace = "")
        String usuarioAdm,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conseguirPedidos", targetNamespace = "http://webservices.com/", className = "com.webservices.ConseguirPedidos")
    @ResponseWrapper(localName = "conseguirPedidosResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.ConseguirPedidosResponse")
    @Action(input = "http://webservices.com/dulceReal/conseguirPedidosRequest", output = "http://webservices.com/dulceReal/conseguirPedidosResponse")
    public String conseguirPedidos();

    /**
     * 
     * @param idcliente
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mostrarPorCliente", targetNamespace = "http://webservices.com/", className = "com.webservices.MostrarPorCliente")
    @ResponseWrapper(localName = "mostrarPorClienteResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.MostrarPorClienteResponse")
    @Action(input = "http://webservices.com/dulceReal/mostrarPorClienteRequest", output = "http://webservices.com/dulceReal/mostrarPorClienteResponse")
    public String mostrarPorCliente(
        @WebParam(name = "idcliente", targetNamespace = "")
        String idcliente);

    /**
     * 
     * @param idpedido
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conseguirVentas", targetNamespace = "http://webservices.com/", className = "com.webservices.ConseguirVentas")
    @ResponseWrapper(localName = "conseguirVentasResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.ConseguirVentasResponse")
    @Action(input = "http://webservices.com/dulceReal/conseguirVentasRequest", output = "http://webservices.com/dulceReal/conseguirVentasResponse")
    public String conseguirVentas(
        @WebParam(name = "idpedido", targetNamespace = "")
        int idpedido);

    /**
     * 
     * @param pedido
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cargarALaCola", targetNamespace = "http://webservices.com/", className = "com.webservices.CargarALaCola")
    @ResponseWrapper(localName = "cargarALaColaResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.CargarALaColaResponse")
    @Action(input = "http://webservices.com/dulceReal/cargarALaColaRequest", output = "http://webservices.com/dulceReal/cargarALaColaResponse")
    public String cargarALaCola(
        @WebParam(name = "pedido", targetNamespace = "")
        String pedido);

    /**
     * 
     * @param clave
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "loguearCliente", targetNamespace = "http://webservices.com/", className = "com.webservices.LoguearCliente")
    @ResponseWrapper(localName = "loguearClienteResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.LoguearClienteResponse")
    @Action(input = "http://webservices.com/dulceReal/loguearClienteRequest", output = "http://webservices.com/dulceReal/loguearClienteResponse")
    public boolean loguearCliente(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conseguirProds", targetNamespace = "http://webservices.com/", className = "com.webservices.ConseguirProds")
    @ResponseWrapper(localName = "conseguirProdsResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.ConseguirProdsResponse")
    @Action(input = "http://webservices.com/dulceReal/conseguirProdsRequest", output = "http://webservices.com/dulceReal/conseguirProdsResponse")
    public String conseguirProds();

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cargarABaseDeDatos", targetNamespace = "http://webservices.com/", className = "com.webservices.CargarABaseDeDatos")
    @ResponseWrapper(localName = "cargarABaseDeDatosResponse", targetNamespace = "http://webservices.com/", className = "com.webservices.CargarABaseDeDatosResponse")
    @Action(input = "http://webservices.com/dulceReal/cargarABaseDeDatosRequest", output = "http://webservices.com/dulceReal/cargarABaseDeDatosResponse")
    public String cargarABaseDeDatos();

}
