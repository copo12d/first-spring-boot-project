package com.copo12d.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    //you can use the @Qualifier("name that you passed") to specify witch bean will be used.

    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }


    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
}
