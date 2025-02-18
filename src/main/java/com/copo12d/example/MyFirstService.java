package com.copo12d.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;
    //Setter injection used to inject dependencies using setters.
    @Autowired
    public void setMyFirstClass(@Qualifier("mySecondClass") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }


    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
}
