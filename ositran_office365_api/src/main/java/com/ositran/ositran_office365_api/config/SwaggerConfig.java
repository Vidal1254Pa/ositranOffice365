package com.ositran.ositran_office365_api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI api() {
        return new OpenAPI().info(new Info().title("Grel Backend Resolution").description("Grel Backend Resolution").version("v1.0.0"));
    }
}
