package it.gacciai.edu.springboot.repository;

import it.gacciai.edu.springboot.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}