package br.com.pvmeira.repository;

import br.com.pvmeira.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

/**
 * Created by pvmeira on 22/02/2017.
 */
public interface BookRepository extends JpaRepository<Book,Long> {
}