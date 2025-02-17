package com.copo12d.example;


//This is used to make a bean object in spring boot
//@Component
//@Service
public class MyFirstClass {
    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }
    public String sayHello(){
      return "Hello from the MyFirstClass ==> myVar = " + myVar;
    };
}
