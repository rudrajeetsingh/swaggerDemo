package com.example.swagger.swaggerDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	//http://localhost:8088/swagger-ui.html
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.swagger.swaggerDemo"))
				.paths(PathSelectors.ant("/rest/**"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo("Spring Boot Swagger API Example", 
				"Spring Boot Swagger for Testing", 
				"1.0", 
				"Terms Of Service", 
				new Contact("Rudra", "http://****/*****", "singh.rudrajeet7@gmail.com"), 
				"Apache License Version 2.0", 
				"https://www.apache.org/licesne.html");
		return apiInfo;
	}
}
