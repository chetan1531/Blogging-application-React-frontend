package com.Project1.blog.config;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {
	
	public static final String AUTHORIZATION_HEADER="Authorization";
	
	private ApiKey apikeys(){
		return new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
	}

	private List<SecurityContext> securityContexts(){
		
		return Arrays.asList(SecurityContext.builder().securityReferences(sf()).build());
	}
	private List<SecurityReference> sf(){
		
		AuthorizationScope scopes=new AuthorizationScope("global", "accessEveryThing");
		
		return Arrays.asList(new SecurityReference("scope", new AuthorizationScope[] {scopes}));
	}
	
	@Bean
	public Docket api()
	{
		
		
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(getInfo()).securityContexts(securityContexts()).securitySchemes(Arrays.asList(apikeys())).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo getInfo() {
		
		return new ApiInfo("Blogging Application: Backend Course", "This project is developed by Chetan", "1.0", "Terms of Service", 
				new Contact("Chetan", "http://LatestUpdatePost.com", "chetanselote88@gmail.com"),
				"Licence of APIS", "API license URL",Collections.emptyList());
	}
}
