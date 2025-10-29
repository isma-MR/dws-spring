package com.cipfpmislata.dws_spring.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String title;
    private String isbn;
    private List<Author> authors;
    private Publisher publisher;
}
