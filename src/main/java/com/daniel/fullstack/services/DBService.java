package com.daniel.fullstack.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.fullstack.domain.Datas;
import com.daniel.fullstack.domain.Livro;
import com.daniel.fullstack.repositories.LivroRepository;

@Service // Informa que essa é uma classe de serviço
public class DBService {

	@Autowired // Informa ao spring que será responsável por CRUD dessa instância
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {

		Livro livro1 = new Livro(null, "pdf", "Spring Boot 2 e Angular 11", Datas.getData(), true);
		Livro livro2 = new Livro(null, "livro", "PHP com XAMP", Datas.getData(), null);
		Livro livro3 = new Livro(null, "ebook", "POO com C++", Datas.getData(), true);
		Livro livro4 = new Livro(null, "apostila", "MySQL e Tomcat", Datas.getData(), null);

		livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3, livro4));
	}

}
