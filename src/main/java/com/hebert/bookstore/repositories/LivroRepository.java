package com.hebert.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hebert.bookstore.domain.Livro;

@Repository// informa o spring que estamos criando uma interface repository
public interface LivroRepository extends JpaRepository<Livro, Integer>{

}
