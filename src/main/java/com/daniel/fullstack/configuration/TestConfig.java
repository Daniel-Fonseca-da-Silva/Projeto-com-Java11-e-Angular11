package com.daniel.fullstack.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.daniel.fullstack.services.DBService;

@Configuration // Informa que é uma classe de configuração
@Profile("test") // Insere um perfil
public class TestConfig {

	@Autowired // Informa ao spring que será responsável por CRUD dessa instância
	private DBService dbService;

	/** Método que sempre instância BD 
	 * sempre que o perfil ativo for o
	 *  perfil de test 
	 */
	public Boolean instancia() {
		this.dbService.instanciaBaseDeDados();
		return true;
	}

}
