package com.copo12d.example;
//Ctrl + Alt + O = removed Unused imports

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collection;
import java.util.Collections;

@SpringBootApplication
public class ExampleApplication {

	public static void main(String[] args) {
		var app = new SpringApplication(ExampleApplication.class);
		app.setAdditionalProfiles("dev");
		var ctx = app.run(args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getCustomPropertyFromAnotherFile());
		System.out.println(myFirstService.getCustomProperty());
		System.out.println(myFirstService.getCustomPropertyInt());


	}

	//@Bean
	//We remove this Bean declaration and move it to ApplicationConfig
	/*
	public MyFirstClass myFirstClass(){
		return new MyFirstClass();
	}
	 */

}
