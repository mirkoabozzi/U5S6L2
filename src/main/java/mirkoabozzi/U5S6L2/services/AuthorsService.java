package mirkoabozzi.U5S6L2.services;


import mirkoabozzi.U5S6L2.entities.Author;
import mirkoabozzi.U5S6L2.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorsService {
    private List<Author> authorList = new ArrayList<>();

    //GET ALL
    public List<Author> findAll() {
        return this.authorList;
    }

    // GET BY ID
    public Author findById(Long id) {
        Author found = this.authorList.stream().filter(author -> author.getId() == id).findFirst().orElse(null);
        if (found == null) throw new NotFoundException(id);
        else return found;
    }

    
}
