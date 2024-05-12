package org.tech.graphQlEx.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Book")
@Table(name = "Book")
@Data
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private Integer pageCount;


}
