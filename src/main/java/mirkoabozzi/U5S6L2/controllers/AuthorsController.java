package mirkoabozzi.U5S6L2.controllers;

import mirkoabozzi.U5S6L2.entities.Author;
import mirkoabozzi.U5S6L2.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorsController {
    @Autowired
    AuthorsService authorsService;

    // GET ALL
    @GetMapping
    private List<Author> getAllAuthors() {
        return authorsService.findAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    private Author findById(@PathVariable Long id) {
        return authorsService.findById(id);
    }

    //POST
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Author saveAuthor(@RequestBody Author body) {
        return authorsService.saveAuthor(body);
    }
}
