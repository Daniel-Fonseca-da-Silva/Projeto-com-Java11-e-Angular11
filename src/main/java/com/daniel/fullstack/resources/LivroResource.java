package com.daniel.fullstack.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.fullstack.domain.Livro;
import com.daniel.fullstack.services.LivroService;

@RestController //	Informa que a classe é uma controladora REST que rebece requisições HTTP
@RequestMapping(value = "/livros")
public class LivroResource {
	
	@Autowired // Informa ao spring que será responsável por CRUD dessa instância
	private LivroService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Integer id) {
		Livro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping(value = "/open")
	public ResponseEntity<List<Livro>> listOpen() {
		List<Livro> list = service.findAllOpen();
		return ResponseEntity.ok().body(list);
	} 
	
}
