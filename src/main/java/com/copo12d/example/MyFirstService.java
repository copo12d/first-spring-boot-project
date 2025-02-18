package com.copo12d.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

    private MyFirstClass myFirstClass;
    private Environment environment;
    //Setter injection used to inject dependencies using setters.
    @Autowired
    public void setMyFirstClass(@Qualifier("mySecondClass") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

    public String tellAStory(){
        return "The dependency is saying : " + myFirstClass.sayHello();
    }

    public String getJavaVersion(){
        return environment.getProperty("java.version");
    }
    public String getOsName(){
        return environment.getProperty("os.name");
    }
    public String getApplicationName(){
        return environment.getProperty("spring.application.name");
    }
    public String getCustomProperty(){
        return environment.getProperty("my.custom.property");
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
