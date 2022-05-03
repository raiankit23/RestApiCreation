package entities;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    private Long id;
    private String title;
    private String description;
}
