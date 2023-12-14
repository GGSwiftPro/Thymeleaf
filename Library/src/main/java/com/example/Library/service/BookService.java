package com.example.Library.service;

import com.example.Library.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private final List<Book> books = new ArrayList<>();
    public void addBook(Book book)
    {
        books.add(book);
    }
    public List<Book> getAllBooks()
    {
        return this.books;
    }
    public List<Book> getBooksByYear(int year)
    {
        return  books.stream().filter( b -> b.getYear() == year).toList();
    }
    public List<Book> getBooksByAuthor(String author)
    {
        return  books.stream().filter( b -> b.getAuthor().equals(author)).toList();
    }


}
