package com.ikea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

 @EnableAuthorizationServer
 @EnableResourceServer
@SpringBootApplication
public class IkeaProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(IkeaProductApplication.class, args);
	}

}
