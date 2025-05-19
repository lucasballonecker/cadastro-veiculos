package com.lucasballonecker.cadastro_veiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CadastroVeiculosApplication {
	public static void main(String[] args)
	{
		SpringApplication.run(CadastroVeiculosApplication.class, args);
	}
}
