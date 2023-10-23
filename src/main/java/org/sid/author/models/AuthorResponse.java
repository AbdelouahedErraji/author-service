package org.sid.author.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.author.entities.Author;

@Data @NoArgsConstructor @AllArgsConstructor
public class AuthorResponse {
    private Long id;
    private String name;
    private String country;

    public AuthorResponse(Author author) {
        this.id = author.getId();
        this.name = author.getName();
        this.country = author.getCountry();
    }
}
