package dev.viegas.spring6webapp.bootstrap;

import dev.viegas.spring6webapp.domain.Author;
import dev.viegas.spring6webapp.domain.Book;
import dev.viegas.spring6webapp.repositories.AuthorRepository;
import dev.viegas.spring6webapp.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

        Book ddd = new Book(null, "Domain Driven Design", "123456");
        Book noEJB = new Book(null, "J2EE Development without EJB", "1233445");

        Author eric = new Author(null, "Eric", "Evans");
        Author rod = new Author(null, "Rod", "Johnson");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);

        Book dddSaved = bookRepository.save(ddd);
        Book noEJBSaved = bookRepository.save(noEJB);

        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Author count: " + authorRepository.count());

    }

}
