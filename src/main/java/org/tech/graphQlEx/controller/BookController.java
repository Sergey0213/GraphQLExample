package org.tech.graphQlEx.controller;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.tech.graphQlEx.model.dto.Book;
import org.tech.graphQlEx.service.BookStoreService;

import java.util.List;

@Controller
public class BookController {

    private final BookStoreService bookStoreService;

    public BookController(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    @QueryMapping
    public List<Book> availableBooks() {
        return bookStoreService.getAvailableBooks();
    }
}
