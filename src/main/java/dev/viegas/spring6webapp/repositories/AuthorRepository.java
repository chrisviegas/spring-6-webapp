package dev.viegas.spring6webapp.repositories;

import dev.viegas.spring6webapp.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
