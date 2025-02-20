package com.copo12d.example;

import com.copo12d.example.Interfaces.MetodoDeEnvio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MetodoDeEnvio tipodeenivio;
    @Autowired
    public MyFirstService(SMS tipodeenivio) {
        this.tipodeenivio = tipodeenivio;
    }
    public MetodoDeEnvio getMetodo() {
        return tipodeenivio;
    }
    /*
    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
     */



}
