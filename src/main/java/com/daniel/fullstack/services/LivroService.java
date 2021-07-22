package com.daniel.fullstack.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.fullstack.domain.Livro;
import com.daniel.fullstack.repositories.LivroRepository;

@Service
public class LivroService {
	
	@Autowired	// Informa ao spring que será responsável por CRUD dessa instância
	private LivroRepository repository;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}