package com.copo12d.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {


    private MyFirstClass myFirstClass;
    //Dependency injection using simple methods (Not to different from constructor method).
    @Autowired
    public void injectDependencies(MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }


    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
}
