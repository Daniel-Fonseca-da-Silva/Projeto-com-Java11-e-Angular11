package com.daniel.fullstack.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.daniel.fullstack.domain.Livro;
import com.daniel.fullstack.services.LivroService;

@RestController //	Informa que a classe é uma controladora REST que rebece requisições HTTP
@RequestMapping(value = "/livros")
public class LivroResource {
	
	@Autowired // Informa ao spring que será responsável por CRUD dessa instância
	private LivroService service;
	
	/** Método que exibe todos os livros pelo seu identificador */
	@GetMapping(value = "/{id}")
	public ResponseEntity<Livro> findById(@PathVariable Integer id) {
		Livro obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	/** Método que exibe todos os livros abertos */
	@GetMapping(value = "/open")
	public ResponseEntity<List<Livro>> listOpen() {
		List<Livro> list = service.findAllOpen();
		return ResponseEntity.ok().body(list);
	}
	
	/** Método que exibe todos os livros fechados */
	@GetMapping(value = "/close")
	public ResponseEntity<List<Livro>> listClose() {
		List<Livro> list = service.findAllClose();
		return ResponseEntity.ok().body(list);
	}
	
	/** Método que exibe todos os livros do BD */
	@GetMapping
	public ResponseEntity<List<Livro>> listAll() {
		List<Livro> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/** Método que cria livros no BD */
	@PostMapping
	public ResponseEntity<Livro> create(@RequestBody Livro obj) {
		obj = service.create(obj);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	/** Método que deleta livros no BD */
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id)
	{
		service.delete(id);
	}
	
}
