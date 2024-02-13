package harouane.u5w2d2RestII.Entities;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    int id;
    String name;
    String lastName;
    String email;
    String dateOfBirth;
    String avatar;
}
