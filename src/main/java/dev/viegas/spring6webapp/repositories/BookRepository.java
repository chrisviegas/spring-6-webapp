package dev.viegas.spring6webapp.repositories;

import dev.viegas.spring6webapp.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
