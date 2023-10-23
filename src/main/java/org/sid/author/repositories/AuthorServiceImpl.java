package org.sid.author.repositories;

import org.sid.author.entities.Author;
import org.sid.author.models.AuthorRequest;
import org.sid.author.models.AuthorResponse;
import org.sid.author.services.AuthorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    private AuthorRepository authorRepository;
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public AuthorResponse getOneAuthor(Long id) {
        Author author = authorRepository.getAuthorById(id);
        AuthorResponse authorRespone = new AuthorResponse(author);
        return authorRespone;
    }

    @Override
    public AuthorResponse addAuthor(AuthorRequest authorRequest) {
        Author author = new Author();
        author.setName(authorRequest.getName());
        author.setCountry(authorRequest.getCountry());
        authorRepository.save(author);
        AuthorResponse authorRespone = new AuthorResponse(author);
        return authorRespone;
    }

    @Override
    public List<AuthorResponse> getAllAuthors() {
        List<Author> authors = authorRepository.findAll();
        List<AuthorResponse> authorResponses = new ArrayList<>();
        authors.forEach(author -> {
            authorResponses.add(new AuthorResponse(author));
        });
        return authorResponses;
    }
}
