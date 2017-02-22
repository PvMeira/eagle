package br.com.pvmeira.service.implementation;

import br.com.pvmeira.model.Book;
import br.com.pvmeira.repository.BookRepository;
import br.com.pvmeira.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pvmeira on 22/02/2017.
 */
@Service
public class BookServiceImplementation implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImplementation(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> listAllBooks() {
        return this.bookRepository.findAll();
    }
    @Override
    public void deleteBook(Long id){
        this.bookRepository.delete(id);
    }
}
