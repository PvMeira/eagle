package br.com.pvmeira.controller;

import br.com.pvmeira.model.Book;
import br.com.pvmeira.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pvmeira on 22/02/2017.
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {

        this.bookService = bookService;
    }


    @RequestMapping(value = "/new", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Book save(@RequestBody final Book book) {
        return this.bookService.saveBook(book);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> listAllBooks() {
        return this.bookService.listAllBooks();
    }

    @RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        this.bookService.deleteBook(id);

    }

}
