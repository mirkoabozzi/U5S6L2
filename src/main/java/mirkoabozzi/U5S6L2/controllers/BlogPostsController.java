package mirkoabozzi.U5S6L2.controllers;

import mirkoabozzi.U5S6L2.entities.BlogPost;
import mirkoabozzi.U5S6L2.services.BlogPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
