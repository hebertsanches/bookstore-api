package com.hebert.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hebert.bookstore.domain.Categoria;

@Repository// informa o spring que estamos criando uma interface repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
