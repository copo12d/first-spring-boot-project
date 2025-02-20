package com.copo12d.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    //We can add names to the beans
    //If there is multiples beans with the same type in this case (MyFirstClass) spring boot will use
    //the first one it founds
    @Bean
    @Qualifier("bean1")
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("First bean");
    }
    @Bean
    //@Qualifier("bean2")
    public MyFirstClass mySecondClass(){
        return new MyFirstClass("Second bean");
    }
    @Bean
    //@Qualifier("bean2")
    //@Primary
    public MyFirstClass myThirdClass(){
        return new MyFirstClass("third bean");
    }

}
