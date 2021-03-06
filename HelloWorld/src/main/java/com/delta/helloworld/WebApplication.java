package com.delta.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.delta.helloworld",
		"com.delta.validator" })
public class WebApplication extends SpringBootServletInitializer {
	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(WebApplication.class);
	    }
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebApplication.class, args);
	}
}
