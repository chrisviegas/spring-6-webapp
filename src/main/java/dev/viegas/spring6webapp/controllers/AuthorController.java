package dev.viegas.spring6webapp.controllers;

import dev.viegas.spring6webapp.domain.Author;
import dev.viegas.spring6webapp.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@RestController
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public Set<Author> getAll() {
        return new HashSet<>(authorService.getAll());
    }

}
