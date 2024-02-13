package harouane.u5w2d2RestII.Services;

import harouane.u5w2d2RestII.Entities.Blogpost;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Service
@Getter
public class BlogpostService {
    List<Blogpost> blogposts= new ArrayList<>();
    public Blogpost saveNewBlogpost(Blogpost blogpost){
        Random random = new Random();
        blogpost.setId(random.nextInt(1, 10000));
        blogposts.add(blogpost);
        return blogpost;
    }

}
