package com.cipfpmislata.dws_spring.domain.service;

import com.cipfpmislata.dws_spring.domain.model.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book getByIsbn(String isbn);
}
