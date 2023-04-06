package com.sergioruy.emailservice;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
		info = @Info(
				title = "E-mail Service Rest Api with Kafka",
				description = "E-mail Service Rest Api with Kafka broker Documentation",
				version = "v1.0",
				contact = @Contact(
						name = "Sergio Ruy",
						email = "sergioruyenator@gmail.com",
						url = "https://sergioruy.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://sergioruy.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "E-mail-Service Doc",
				url = "https://sergioruy.com"
		)
)
@SpringBootApplication
public class EmailServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
