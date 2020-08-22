package com.example.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
