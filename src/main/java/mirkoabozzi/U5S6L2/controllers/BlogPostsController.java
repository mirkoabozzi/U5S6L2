package mirkoabozzi.U5S6L2.controllers;

import mirkoabozzi.U5S6L2.entities.BlogPost;
import mirkoabozzi.U5S6L2.services.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogPosts")
public class BlogPostsController {

    @Autowired
    BlogPostsService blogPostsService;

    //GET ALL
    @GetMapping
    private List<BlogPost> getAllBlogPosts() {
        return blogPostsService.findAll();
    }

    //GET BY ID
    @GetMapping("/{id}")
    private BlogPost findById(@PathVariable Long id) {
        return blogPostsService.findById(id);
    }

    //POST
    @PostMapping
    private BlogPost createBlogPosts(@RequestBody BlogPost body) {
        return blogPostsService.saveBlogPost(body);
    }

    //PUT
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost findByIdAndUpdate(@PathVariable Long id, @RequestBody BlogPost body) {
        return blogPostsService.findByIdAndUpdate(id, body);
    }

    //DELETE
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private void findByIdAndDelete(@PathVariable Long id) {
        blogPostsService.findBiIdAndDelete(id);
    }

}
