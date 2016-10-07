package com.example;

/**
 * Created by muneeb on 14/04/16.
 */
import javax.jws.WebService;

@WebService(endpointInterface = "com.example.HelloWorldServer")
public class HelloWorldServerImpl implements HelloWorldServer {

    public String sayHello(String name) {
        try{
            Thread.sleep(1000*5);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Hello " + name + " !, Hope you are doing well !!";
    }

}
