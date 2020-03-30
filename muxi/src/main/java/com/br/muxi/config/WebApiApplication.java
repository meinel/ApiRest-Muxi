package com.br.muxi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WebApiApplication {

	public static void main(String[] args) {         
		SpringApplication.run(WebApiApplication.class, args);     
	}

}
