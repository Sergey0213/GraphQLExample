package org.tech.graphQlEx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.tech.graphQlEx.model.entity.BookEntity;

@Repository
public interface BookStoreRepository extends JpaRepository<BookEntity, Integer> {


}
