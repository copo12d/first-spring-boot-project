package com.copo12d.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {
    //field injection is not recommended to used is always better to used constructor injection
    @Autowired
    @Qualifier("mySecondClass")
    private MyFirstClass myFirstClass;


    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
}
