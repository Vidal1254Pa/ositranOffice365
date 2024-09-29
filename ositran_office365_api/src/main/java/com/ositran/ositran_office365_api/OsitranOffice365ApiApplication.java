package com.ositran.ositran_office365_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ositran.*"})
@EntityScan(basePackages = {"com.ositran.*"})
@EnableJpaRepositories(basePackages = {"com.ositran.*"})
public class OsitranOffice365ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OsitranOffice365ApiApplication.class, args);
    }

}
