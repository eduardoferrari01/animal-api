package br.com.animal.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Animal API", version = "1.0", description = "Information"))
@EnableCaching
@EnableAutoConfiguration
public class AnimalApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalApiApplication.class, args);
	}

}
