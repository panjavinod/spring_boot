package com.demo.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwegarConfig {
	@Bean
	public Docket postsApi() {

	return new Docket(DocumentationType.SWAGGER_2).groupName("demo").apiInfo(apiInfo()).select()

	.paths(regex("/api.*")).build();

	}



	private ApiInfo apiInfo() {

	return new ApiInfoBuilder().title("Procucts API")

	.description("demo Procucts API Documentation Generateed Using SWAGGER2 for our Product Rest API")

	.termsOfServiceUrl("https://www.youtube.com/channel/UC-85Tmx8lhNZQmBNbxZiqkw")

	.license("demo Rest API License")

	.licenseUrl("https://www.youtube.com/channel/UC-85Tmx8lhNZQmBNbxZiqkw").version("1.0").build();

	}
}
