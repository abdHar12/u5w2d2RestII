package harouane.u5w2d2RestII.Services;

import harouane.u5w2d2RestII.Entities.Author;
import harouane.u5w2d2RestII.Entities.Blogpost;
import harouane.u5w2d2RestII.Exceptions.NotFoundAnyElement;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
@Service
@Getter
public class BlogpostService {
    List<Blogpost> blogposts= new ArrayList<>();
    public Blogpost saveNewBlogpost(Blogpost blogpost){
        Random random = new Random();
        blogpost.setId(random.nextInt(1, 10000));
        this.blogposts.add(blogpost);
        return blogpost;
    }

    public Blogpost getSingleBlogpost(int id){
        return this.blogposts.stream().filter(el->el.getId()==id).findFirst().orElseThrow();
    }


    public Blogpost modifyPost(int id, Blogpost blogpost) {
        return this.blogposts.stream().filter(el->el.getId()==id).map(el->{
            el.setTitle(blogpost.getTitle());
            el.setCategory(blogpost.getCategory());
            el.setCover(blogpost.getCover());
            el.setContent(blogpost.getContent());
            el.setTimeOfReading(blogpost.getTimeOfReading());
            return el;
        }).findFirst().orElseThrow();
    }

    public void removePost(int id){
        Iterator<Blogpost> iterator= this.blogposts.iterator();
        while (iterator.hasNext()){
            Blogpost current=iterator.next();
            if(current.getId()==id) iterator.remove();
        }
    }
}
