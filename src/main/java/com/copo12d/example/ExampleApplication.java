package com.copo12d.example;
//Ctrl + Alt + O = removed Unused imports

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(ExampleApplication.class, args);

		MyFirstService tipo = ctx.getBean(MyFirstService.class);
		tipo.getMetodo().mensaje();

	}

	//@Bean
	//We remove this Bean declaration and move it to ApplicationConfig
	/*
	public MyFirstClass myFirstClass(){
		return new MyFirstClass();
	}
	 */

}
