package com.hebert.bookstore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hebert.bookstore.domain.Categoria;
import com.hebert.bookstore.service.CategoriaService;

//Informar ao spring que essa é uma classe de controlador rest

@RestController
@RequestMapping(value = "/categorias")//endpoint inicial(localhost:8080/categorias/id
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping(value = "/{id}")//-> se chegar uma requisicao get pro endpoint /categorias é esse metodo que ele vai utilizar
	public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
