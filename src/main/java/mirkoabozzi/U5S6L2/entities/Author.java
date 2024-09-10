package mirkoabozzi.U5S6L2.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Author {
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String avatar;
}
