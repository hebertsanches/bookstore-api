package com.hebert.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hebert.bookstore.service.DBService;

@Configuration
@Profile("test")// avisa o spring que o perfil ativo é o test
public class TestConfig {
	@Autowired
	private DBService dbService; //intanciando uma nova classe dbservice
	
	//metodo para instanciar basededados
	@Bean// -> pra identificar que o metodo suba quando o perfil de teste estiver ativo
	public void instanciaBaseDeDados() {
		this.dbService.instanciaBaseDeDados();
	}
}
