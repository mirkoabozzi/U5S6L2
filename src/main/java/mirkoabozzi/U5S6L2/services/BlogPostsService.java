package mirkoabozzi.U5S6L2.services;

import mirkoabozzi.U5S6L2.entities.BlogPost;
import mirkoabozzi.U5S6L2.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostsService {
    private List<BlogPost> blogPostList = new ArrayList<>();

    //GET ALL
    public List<BlogPost> findAll() {
        return this.blogPostList;
    }

    //GET BLOGPOST
    public BlogPost findById(Long id) {
        BlogPost found = this.blogPostList.stream().filter(blogPost -> blogPost.getId() == id).findFirst().orElse(null);
        if (found == null) throw new NotFoundException(id);
        return found;
    }

    // POST
    public BlogPost saveBlogPost(BlogPost payload) {
        Random random = new Random();
        payload.setId(random.nextInt(1, 1000));
        payload.setCover("http://localhost:8080/" + payload.getTitle());
        this.blogPostList.add(payload);
        return payload;
    }

    //PUT
    public BlogPost findByIdAndUpdate(Long id, BlogPost newBlogPost) {
        BlogPost found = this.findById(id);
        found.setCategory(newBlogPost.getCategory());
        found.setTitle(newBlogPost.getTitle());
        found.setContent(newBlogPost.getContent());
        found.setReadingTime(newBlogPost.getReadingTime());
        return found;
    }

    //DELETE
    public void findBiIdAndDelete(Long id) {
        BlogPost found = this.findById(id);
        this.blogPostList.remove(found);
    }

}
