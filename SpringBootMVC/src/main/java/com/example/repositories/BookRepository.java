package com.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
