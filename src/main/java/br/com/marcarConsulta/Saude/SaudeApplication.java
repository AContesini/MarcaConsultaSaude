package br.com.marcarConsulta.Saude;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SaudeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SaudeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Teste");
	}
}
