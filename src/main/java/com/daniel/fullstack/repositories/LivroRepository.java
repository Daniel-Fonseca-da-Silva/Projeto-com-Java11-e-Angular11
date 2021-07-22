package com.daniel.fullstack.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.fullstack.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
