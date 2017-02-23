package br.com.pvmeira.service;

import br.com.pvmeira.model.Book;

import java.util.List;

/**
 * Created by pvmeira on 22/02/2017.
 */

public interface BookService {
    Book saveBook(Book book);
    List<Book> listAllBooks();
    void deleteBook(Long id);
    Book updateBook(Book book);
}
