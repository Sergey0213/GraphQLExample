package org.tech.graphQlEx.model.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Book {

    private Integer id;
    private String title;
    private String author;
    private Integer pageCount;

}
