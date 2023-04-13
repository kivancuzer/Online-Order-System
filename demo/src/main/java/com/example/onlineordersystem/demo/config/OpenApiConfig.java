package com.example.onlineordersystem.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Online Order System API")
                        .description("This is the API documentation for the Online Order System")
                        .version("1.0.0")
                        .contact(new Contact().name("Kivanc Uzer").email("kivancuzer@gmail.com")
                                .url("https://kivancuzer.com")));
    }

}
