/** @author Daniel-F-S
 *  @since 1.0.0
 */
package com.daniel.fullstack;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FullstackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FullstackApplication.class, args);
	}

	/**
	 * Método que sempre executa o código dentro sempre que a aplicação for
	 * reiniciada
	 */
	@Override
	public void run(String... args) throws Exception {

	}

}
