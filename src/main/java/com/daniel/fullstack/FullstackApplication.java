/** @author Daniel-F-S
 *  @since 1.0.0
 */
package com.daniel.fullstack;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daniel.fullstack.domain.Livro;

@SpringBootApplication
public class FullstackApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FullstackApplication.class, args);
	}

	/** Método que sempre executa o código dentro sempre que a aplicação foir reiniciada */
	@Override
	public void run(String... args) throws Exception {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Livro livro1 = new Livro(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", LocalDateTime.parse("25/03/2022", formato) , null);
		
	}

}
