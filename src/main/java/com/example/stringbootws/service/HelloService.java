package com.example.stringbootws.service;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebService;
@Component(value ="HelloService")
@WebService
public class HelloService {

    @WebMethod
    public String sayHello(String name){
        return String.format("Hello world, %s",name);
    }
}
