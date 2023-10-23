package org.sid.author;

import org.sid.author.entities.Author;
import org.sid.author.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AuthorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthorApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AuthorRepository authorRepository) {
        return args -> {
            for (int i = 0; i < 10; i++) {
                Author author = new Author();
                author.setName("Author" + i);
                author.setCountry("Country" + i);
                authorRepository.save(author);
            }

            List<Author> authors = authorRepository.findAll();
            authors.forEach(author -> {
                System.out.println(author.toString());
            });
        };
    }

}
