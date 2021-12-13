package com.hebert.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hebert.bookstore.domain.Categoria;
import com.hebert.bookstore.repositories.CategoriaRepository;
import com.hebert.bookstore.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;// camada que faz acesso aos dados

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado Id" + id + ", Tipo: " + Categoria.class.getName()));

	}
	

	//metodo que retorna uma lista de categorias do banco.
	public List<Categoria> findAll(){
		return repository.findAll();
	}
}
