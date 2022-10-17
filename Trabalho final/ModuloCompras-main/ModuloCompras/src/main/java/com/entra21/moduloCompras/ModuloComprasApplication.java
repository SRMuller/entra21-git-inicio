package com.entra21.moduloCompras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ModuloComprasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModuloComprasApplication.class, args);
	}

}
