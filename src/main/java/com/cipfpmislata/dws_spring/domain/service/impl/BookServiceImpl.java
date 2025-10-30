package com.cipfpmislata.dws_spring.domain.service.impl;

import com.cipfpmislata.dws_spring.domain.model.Book;
import com.cipfpmislata.dws_spring.domain.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Locale.filter;

@Service
public class BookServiceImpl implements BookService {

    List<Book> books = List.of(
            new Book("Book 1", "ISBN001", List.of(), null),
            new Book("Book 2", "ISBN002", List.of(), null),
            new Book("Book 3", "ISBN003", List.of(), null),
            new Book("Book 4", "ISBN004", List.of(), null),
            new Book("Book 5", "ISBN005", List.of(), null)
    );
    @Override
    public List<Book> getAll() {
        return books;
    }

    @Override
    public Book getByIsbn(String isbn) {
        return books.stream()
                .filter(book -> book.getIsbn().equals(isbn))
                .findFirst()
                .orElse(null);
    }
}
