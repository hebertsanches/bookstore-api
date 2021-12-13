package com.hebert.bookstore.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hebert.bookstore.domain.Categoria;
import com.hebert.bookstore.dtos.CategoriaDTO;
import com.hebert.bookstore.service.CategoriaService;

//Informar ao spring que essa é uma classe de controlador rest

@RestController
@RequestMapping(value = "/categorias") // endpoint inicial(localhost:8080/categorias/id
public class CategoriaResource {

	@Autowired
	private CategoriaService service;

	@GetMapping(value = "/{id}") // -> se chegar uma requisicao get pro endpoint /categorias é esse metodo que
									// ele vai utilizar
	public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
		Categoria obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> findAll() {
		List<Categoria> list = service.findAll();
		List<CategoriaDTO> listDTO = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());//transforma uma lista de categoria para uma lista categoria do tipo DTO
		return ResponseEntity.ok().body(listDTO);
	}
	// ^Quando vir uma pesquisa /categorias sem nenhum outro argumento ela vai cair
	// no Categoria DTO
}
