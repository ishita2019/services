package com.delta.pipeline.DCPipeline;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.delta.pipeline.DCPipeline"})
public class DcPipelineApplication extends SpringBootServletInitializer{

	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DcPipelineApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(DcPipelineApplication.class, args);
	}
}
