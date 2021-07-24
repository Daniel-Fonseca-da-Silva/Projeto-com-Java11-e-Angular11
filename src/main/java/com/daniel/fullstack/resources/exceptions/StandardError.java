package com.daniel.fullstack.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	
	// Permite ser trafegado em rede, armazenado etc(boa prática!)
	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
	private Integer status;
	private String message;
	
	// Construtor de classe
	public StandardError() {
		super();
	}
	
	// Construtor povoado
	public StandardError(Long timestamp, Integer status, String message) {
		super();
		this.timestamp = timestamp;
		this.status = status;
		this.message = message;
	}

	// Gets e Sets
	public Long getTimestamp() {
		return timestamp;
	}

	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
}
