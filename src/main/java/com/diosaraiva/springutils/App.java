package com.diosaraiva.springutils;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class App{
	public static void main(String[] args) 
	{
		new SpringApplicationBuilder(App.class)
		.web(WebApplicationType.SERVLET)
		.headless(false)
		.run(args);
	}
}