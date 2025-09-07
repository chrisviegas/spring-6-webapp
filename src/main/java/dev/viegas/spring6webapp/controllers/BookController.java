package dev.viegas.spring6webapp.controllers;

import dev.viegas.spring6webapp.domain.Book;
import dev.viegas.spring6webapp.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Set;

@RequiredArgsConstructor
@RestController
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public Set<Book> getAll() {
        return new HashSet<>(bookService.getAll());
    }

}
