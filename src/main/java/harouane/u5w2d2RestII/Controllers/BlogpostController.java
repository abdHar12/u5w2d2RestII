package harouane.u5w2d2RestII.Controllers;

import harouane.u5w2d2RestII.Entities.Blogpost;
import harouane.u5w2d2RestII.Services.BlogpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
