package dev.viegas.spring6webapp.bootstrap;

import dev.viegas.spring6webapp.domain.Author;
import dev.viegas.spring6webapp.domain.Book;
import dev.viegas.spring6webapp.domain.Publisher;
import dev.viegas.spring6webapp.repositories.AuthorRepository;
import dev.viegas.spring6webapp.repositories.BookRepository;
import dev.viegas.spring6webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

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

        Publisher oreillyMedia = new Publisher(null, "O'Reilly Media", "1005 Gravenstein Highway North", "Sebastopol", "CA", "95472");
        Publisher manningPub = new Publisher(null, "Manning Publications", "20 Baldwin Road", "Shelter Island", "NY", "11964");

        Author ericSaved = authorRepository.save(eric);
        Author rodSaved = authorRepository.save(rod);

        Book dddSaved = bookRepository.save(ddd);
        Book noEJBSaved = bookRepository.save(noEJB);

        Publisher oreillyMediaSaved = publisherRepository.save(oreillyMedia);
        Publisher manningPubSaved = publisherRepository.save(manningPub);

        System.out.println("Book count: " + bookRepository.count());
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Publisher count: " + publisherRepository.count());

    }

}
