package com.example.Library.controller;
import com.example.Library.model.Book;
import com.example.Library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService service){
        this.bookService = service;
    }

    @PostMapping
    public void addBook(@RequestBody Book book)
    {
        bookService.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/year/{year}")
    public List<Book> getBooksByYear(@PathVariable int year){
        return bookService.getBooksByYear(year);
    }

    @GetMapping("/author/{author}")
    public List<Book> getBooksByAuthor(@PathVariable String author){
        return bookService.getBooksByAuthor(author);
    }
}
