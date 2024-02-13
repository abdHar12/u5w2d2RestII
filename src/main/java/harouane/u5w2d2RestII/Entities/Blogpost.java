package harouane.u5w2d2RestII.Entities;

import lombok.*;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blogpost {
    int id;
    String category;
    String title;
    String cover;
    String content;
    int timeOfReading;


}
