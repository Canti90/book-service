package com.example.bookservice;


import org.springframework.data.repository.CrudRepository;

public interface BookService extends CrudRepository<Book, Long> {
}
