package peaksoft.jwtpracticeprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import peaksoft.jwtpracticeprojekt.entity.Course;


@Getter
@Setter
@Data
public class TeacherResponse {
    @NotNull
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Course course;
}
