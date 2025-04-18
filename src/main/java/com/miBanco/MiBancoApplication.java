package com.miBanco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
/*@EntityScan("com.miBanco.model")
@EnableJpaRepositories("com.miBanco.repository")*/
public class MiBancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiBancoApplication.class, args);
	}

}
