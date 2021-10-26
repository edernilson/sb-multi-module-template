package com.edernilson.pluginapp.frontjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScans(value = {
        @ComponentScan(value = "com.edernilson.pluginapp.infra.service"),
        @ComponentScan(value = "com.edernilson.pluginapp.frontjsp.managebeans")
})
@EnableJpaRepositories(basePackages={"com.edernilson.pluginapp.infra.repository"})
@EntityScan(basePackages={"com.edernilson.pluginapp.infra.model"})
@PropertySources({
        @PropertySource("application-infra.properties")
})
@SpringBootApplication
public class FrontJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrontJspApplication.class, args);
    }

}
