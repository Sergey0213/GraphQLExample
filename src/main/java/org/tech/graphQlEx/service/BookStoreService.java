package org.tech.graphQlEx.service;

import org.springframework.stereotype.Service;
import org.tech.graphQlEx.mapper.BookEntityToBookMapper;
import org.tech.graphQlEx.model.dto.Book;
import org.tech.graphQlEx.repository.BookStoreRepository;

import java.util.List;

@Service
public class BookStoreService {

    private final BookStoreRepository bookStoreRepository;
    private final BookEntityToBookMapper bookEntityToBookMapper;

    public BookStoreService(BookStoreRepository bookStoreRepository, BookEntityToBookMapper bookEntityToBookMapper) {
        this.bookStoreRepository = bookStoreRepository;
        this.bookEntityToBookMapper = bookEntityToBookMapper;
    }

    public List<Book> getAvailableBooks() {
        return bookEntityToBookMapper.mapAll(bookStoreRepository.findAll());
    }
}
