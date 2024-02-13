package harouane.u5w2d2RestII.Controllers;

import harouane.u5w2d2RestII.Entities.Blogpost;
import harouane.u5w2d2RestII.Services.BlogpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogposts")
public class BlogpostController {
    @Autowired
    BlogpostService blogpostService;

    @GetMapping
    public List<Blogpost> getAllBlogs(){
        return blogpostService.getBlogposts();
    }

    @PostMapping
    public Blogpost saveNewBlogs(@RequestBody Blogpost blogpost){
        return blogpostService.saveNewBlogpost(blogpost);
    }
    @GetMapping("/{id}")
    public Blogpost getSingleBlogpost(@PathVariable int id){
        return blogpostService.getSingleBlogpost(id);
    }

    @PutMapping("/{id}")
    public Blogpost modifyPost(@PathVariable int id, @RequestBody Blogpost blogpost){
        return blogpostService.modifyPost(id, blogpost);
    }

    @DeleteMapping("/{id}")
    public void removePost(@PathVariable int id){
        blogpostService.removePost(id);
    }
}
