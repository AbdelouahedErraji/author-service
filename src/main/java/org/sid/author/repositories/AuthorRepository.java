package org.sid.author.repositories;

import org.sid.author.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author getAuthorById(Long id);
}
