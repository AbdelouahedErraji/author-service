package org.sid.author.services;

import org.sid.author.entities.Author;
import org.sid.author.models.AuthorRequest;
import org.sid.author.models.AuthorResponse;
import org.sid.author.repositories.AuthorRepository;

import java.util.List;

public interface AuthorService {
    public AuthorResponse getOneAuthor(Long id);
    public AuthorResponse addAuthor(AuthorRequest authorRequest);
    public List<AuthorResponse> getAllAuthors();
}
