package mirkoabozzi.U5S6L2.services;

import mirkoabozzi.U5S6L2.entities.BlogPost;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogPostsService {
    private List<BlogPost> blogPostList = new ArrayList<>();

    //GET ALL
    public List<BlogPost> findAll() {
        return this.blogPostList;
    }


}
