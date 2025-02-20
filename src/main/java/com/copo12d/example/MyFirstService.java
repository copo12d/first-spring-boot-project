package com.copo12d.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

    private final MyFirstClass myFirstClass;
    @Value("${my.prop}")
    private String customPropertyFromAnotherFile;
    @Value("${my.custom.property}")
    private String customProperty;
    @Value("${my.custom.property.int}")
    private Integer customPropertyInt;
    @Autowired
    public MyFirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;


    }
    public String tellAStory() {
        return "The dependency is saying: " + myFirstClass.sayHello() ;
    }

    public String getCustomPropertyFromAnotherFile() {
        return customPropertyFromAnotherFile;
    }

    public String getCustomProperty() {
        return customProperty;
    }

    public Integer getCustomPropertyInt() {
        return customPropertyInt;
    }

    /*
    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }
     */



}
