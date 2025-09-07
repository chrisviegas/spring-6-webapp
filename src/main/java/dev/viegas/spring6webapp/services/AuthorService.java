package dev.viegas.spring6webapp.services;

import dev.viegas.spring6webapp.domain.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAll();
}
