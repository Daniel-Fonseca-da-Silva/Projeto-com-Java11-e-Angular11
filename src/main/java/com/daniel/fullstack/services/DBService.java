package com.daniel.fullstack.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.fullstack.domain.Livro;
import com.daniel.fullstack.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired // Informa ao spring que será responsável por CRUD dessa instância
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		Livro livro1 = new Livro(null, "Estudar", "Estudar Spring Boot 2 e Angular 11", LocalDateTime.parse("25/03/2022 11:59", formato) , null);
		
		livroRepository.saveAll(Arrays.asList(livro1));
	}

}
