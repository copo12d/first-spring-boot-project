package com.copo12d.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfig {
    @Bean
    @Qualifier("bean1")
    @Profile("dev")
    public MyFirstClass myFirstClass(){
        return new MyFirstClass("First bean");
    }
    @Bean
    @Qualifier("bean2")
    //@Profile("test")
    public MyFirstClass mySecondClass(){
        return new MyFirstClass("Second bean");
    }
    @Bean
    @Qualifier("bean3")
    public MyFirstClass myThirdClass(){
        return new MyFirstClass("third bean");
    }

}
