package harouane.u5w2d2RestII.Services;

import harouane.u5w2d2RestII.Entities.Author;
import harouane.u5w2d2RestII.Exceptions.NotFoundAnyElement;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Getter
@Service
public class AuthorService {

    List<Author> authors=new ArrayList<>();
     public Author saveNewAuthor(Author author){
         Random random = new Random();
         author.setId(random.nextInt(1, 10000));
         this.authors.add(author);
         return author;
     }

    public Author findById(int id) {
         for(Author author:this.authors){
             if (author.getId()==id) return author;
         }
         throw new NotFoundAnyElement();
    }

    public Author modifyAuthor(int id, Author modifiedAuthor){
         for (Author author:this.authors){
             if(author.getId()==id){
                 author.setAvatar(modifiedAuthor.getAvatar());
                 author.setName(modifiedAuthor.getName());
                 author.setLastName(modifiedAuthor.getLastName());
                 author.setEmail(modifiedAuthor.getEmail());
                 author.setDateOfBirth(modifiedAuthor.getDateOfBirth());
                 return author;
             }
         }
         throw new NotFoundAnyElement();
    }

    public void deleteAuthor(int id){
        Iterator<Author> authorIterator= this.authors.iterator();
        while (authorIterator.hasNext()){
            Author current=authorIterator.next();
            if(current.getId()==id) authorIterator.remove();
        }
    }
}
