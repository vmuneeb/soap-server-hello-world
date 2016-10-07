package com.example;

/**
 * Created by muneeb on 14/04/16.
 */
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloWorldServer {

    @WebMethod
    String sayHello(String name);
}
