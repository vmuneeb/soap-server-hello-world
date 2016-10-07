package com.example;

/**
 * Created by muneeb on 14/04/16.
 */
import javax.xml.ws.Endpoint;

public class HelloWorldServerPublisher {

    public static void main(String[] args) {

        System.out.println("Beginning to publish HelloWorldService now");
        Endpoint.publish("http://127.0.0.1:3000/hw", new HelloWorldServerImpl());
        System.out.println("Done publishing");
    }

}
