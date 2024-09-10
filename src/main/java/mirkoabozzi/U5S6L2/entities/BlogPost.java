package mirkoabozzi.U5S6L2.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BlogPost {
    private long id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readingTime;
}
