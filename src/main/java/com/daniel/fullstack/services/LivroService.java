package com.daniel.fullstack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.daniel.fullstack.domain.Livro;
import com.daniel.fullstack.repositories.LivroRepository;
import com.daniel.fullstack.services.exceptions.ObjectNotFoundException;

@Service
public class LivroService {
	
	@Autowired	// Informa ao spring que será responsável por CRUD dessa instância
	private LivroRepository repository;
	
	public Livro findById(Integer id) {
		Optional<Livro> obj = repository.findById(id);
		return obj.orElseThrow(() -> new 
		ObjectNotFoundException("Objeto não encontrado! id " +
		id + " tipo: " + Livro.class.getName()));
	}

	public List<Livro> findAllOpen() {
		List<Livro> list = repository.findAllOpen();
		return list;
	}

	public List<Livro> findAllClose() {
		List<Livro> list = repository.findAllClose();
		return list;
	}

	public List<Livro> findAll() {
		List<Livro> list = repository.findAll();
		return list;
	}

	public Livro create(Livro obj) {
		obj.setId(null); // Impede usuário de modificar a PK
		return repository.save(obj);
	}

	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
}
