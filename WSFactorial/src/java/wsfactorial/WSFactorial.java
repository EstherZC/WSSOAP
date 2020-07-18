/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsfactorial;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Entrar
 */
@WebService(serviceName = "WSFactorial")
public class WSFactorial {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public double factorial(@WebParam(name = "elem") double elem) {
        double numero = elem;
        if (numero==0)
            return 1;
        else
           return numero * factorial(numero-1);

    }
}
