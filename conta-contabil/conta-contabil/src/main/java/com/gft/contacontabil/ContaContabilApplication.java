package com.gft.contacontabil;

import org.aspectj.bridge.ICommand;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class ContaContabilApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContaContabilApplication.class, args);
	}

	public void teste(){
		Optional<String> teste = Optional.of("qualquer texto");
		teste.orElse("valor default");
		String algo = teste.orElse("aaaa");
	}

	@Override
	public void run(String... args) throws Exception {
	/*	Optional<String> teste = Optional.ofNullable(null);
		teste.orElse("valor default");
		String algo = teste.orElse("aaaa");
		System.out.println(algo);*/
	}
}
