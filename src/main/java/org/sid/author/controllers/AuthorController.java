package org.sid.author.controllers;

import org.sid.author.models.AuthorRequest;
import org.sid.author.models.AuthorResponse;
import org.sid.author.services.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/author")
public class AuthorController {
    private AuthorService authorService;
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/{id}")
    public AuthorResponse getOneAuthor(@PathVariable("id") Long id) {
        return authorService.getOneAuthor(id);
    }

    @PostMapping("/add")
    public AuthorResponse addAuthor(@RequestBody AuthorRequest authorRequest) {
        AuthorResponse authorResponse = authorService.addAuthor(authorRequest);
        return authorResponse;
    }

    @GetMapping("/authors")
    public List<AuthorResponse> getAll() {
        List<AuthorResponse> authors = authorService.getAllAuthors();
        return authors;
    }
}
