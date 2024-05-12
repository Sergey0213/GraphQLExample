package org.tech.graphQlEx.mapper;

import org.springframework.stereotype.Component;
import org.tech.graphQlEx.model.dto.Book;
import org.tech.graphQlEx.model.entity.BookEntity;

import java.util.List;
import java.util.Optional;

@Component
public class BookEntityToBookMapper {

    public List<Book> mapAll(List<BookEntity> bookEntityList) {
        return bookEntityList.stream().map(this::map).toList();
    }

    public Book map(BookEntity bookEntity) {
        return Optional.ofNullable(bookEntity)
                .map(this::buildBook)
                .orElse(null);
    }

    private Book buildBook(BookEntity book) {
        return new Book()
                .setId(book.getId())
                .setTitle(book.getTitle())
                .setAuthor(book.getAuthor())
                .setPageCount(book.getPageCount());
    }

}
