package com.daniel.fullstack.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.daniel.fullstack.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

	@Query("SELECT obj FROM Livro obj WHERE obj.finalizado = null ORDER BY obj.dataParaFinalizar")
	List<Livro> findAllOpen();

}
