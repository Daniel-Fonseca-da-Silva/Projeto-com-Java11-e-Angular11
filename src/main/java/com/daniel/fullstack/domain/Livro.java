package com.daniel.fullstack.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Informa que essa classe representa uma entidade e seus objetos devem ser
		// persistidos em um BD
public class Livro implements Serializable {

	// Permite ser trafegado em rede, armazenado etc(boa prática!)
	private static final long serialVersionUID = 1L;

	// Atributos
	@Id // Define id como pk
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Informa ao BD que irá ser responsável pela geração da PK
	private Integer id;
	private String titulo;
	private String descricao;
	private String dataParaFinalizar;
	private Boolean finalizado;

	// Construtor de classe
	public Livro() {
		super();
	}

	// Construtor povoado
	public Livro(Integer id, String titulo, String descricao, String dataParaFinalizar, Boolean finalizado) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataParaFinalizar = dataParaFinalizar;
		this.finalizado = finalizado;
	}

	// Get e Set
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataParaFinalizar() {
		return dataParaFinalizar;
	}

	public void setDataParaFinalizar(String dataParaFinalizar) {
		this.dataParaFinalizar = dataParaFinalizar;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	// Hashcode e equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
