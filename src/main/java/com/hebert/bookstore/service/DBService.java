package com.hebert.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hebert.bookstore.domain.Categoria;
import com.hebert.bookstore.domain.Livro;
import com.hebert.bookstore.repositories.CategoriaRepository;
import com.hebert.bookstore.repositories.LivroRepository;

@Service
public class DBService {
	
	//instacia de categoria repository e livrorepository
	
		@Autowired
		private CategoriaRepository categoriaRepository;
		@Autowired
		private LivroRepository livroRepository;

	//metodo para instanciar a base de dados
	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informática", "Livro de TI");
		Categoria cat2 = new Categoria(null, "Ficção Científica", "Ficção Científica");
		Categoria cat3 = new Categoria(null, "História", "Livros de Historia");
		Categoria cat4 = new Categoria(null, "Terror", "Terror");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Loren ipsun", cat1);
		Livro l2 = new Livro(null, "Java Como Programar", "Deitel", "Loren ipsun", cat1);
		Livro l3 = new Livro(null, "Doctor Who", " Alex Scarrow", "Doze Doutores", cat2);
		Livro l4 = new Livro(null, "1822", "Laurentino Gomes", "Loren ipsun", cat3);
		Livro l5 = new Livro(null, "O Chamado", "Desconhecido", "Tem a Samara", cat4);
		Livro l6 = new Livro(null, "O Mimado", "Desconhecido", "Tem a Samara", cat4);
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		cat2.getLivros().addAll(Arrays.asList(l3));
		cat3.getLivros().addAll(Arrays.asList(l4));
		cat4.getLivros().addAll(Arrays.asList(l5));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		this.livroRepository.saveAll(Arrays.asList(l1,l2,l3,l4,l5,l6));
	}
	
}
