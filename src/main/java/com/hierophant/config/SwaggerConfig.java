package com.hierophant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	/**
	 * Made possible with SpringFox Dependency
	 * https://www.webdevelopmenthelp.net/2016/08/use-spring-fox-java-application-development.html
	 */
	
	// you can see all the generated documentation by going to http://localhost:5000/swagger-ui/
	
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.hierophant.controller"))
				.paths(PathSelectors.any())
				.build();
		
	}
}
