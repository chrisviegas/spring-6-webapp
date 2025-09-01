package dev.viegas.spring6webapp.repositories;

import dev.viegas.spring6webapp.domain.Author;
import dev.viegas.spring6webapp.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
