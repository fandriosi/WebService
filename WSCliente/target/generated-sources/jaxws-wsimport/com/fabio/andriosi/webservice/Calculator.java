
package com.fabio.andriosi.webservice;

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
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://webservice.andriosi.fabio.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param op
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod(operationName = "Add")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Add", targetNamespace = "http://webservice.andriosi.fabio.com/", className = "com.fabio.andriosi.webservice.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://webservice.andriosi.fabio.com/", className = "com.fabio.andriosi.webservice.AddResponse")
    @Action(input = "http://webservice.andriosi.fabio.com/Calculator/AddRequest", output = "http://webservice.andriosi.fabio.com/Calculator/AddResponse")
    public int add(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j,
        @WebParam(name = "op", targetNamespace = "")
        String op);

}