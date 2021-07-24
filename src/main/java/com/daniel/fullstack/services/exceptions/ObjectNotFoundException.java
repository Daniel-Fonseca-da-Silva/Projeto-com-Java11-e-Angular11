package com.daniel.fullstack.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {

	// Permite ser trafegado em rede, armazenado etc(boa prática!)
	private static final long serialVersionUID = 1L;

	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public ObjectNotFoundException(String message) {
		super(message);
	}
	
}
