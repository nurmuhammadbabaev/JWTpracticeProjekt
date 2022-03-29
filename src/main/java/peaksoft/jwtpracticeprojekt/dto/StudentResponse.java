package peaksoft.jwtpracticeprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import peaksoft.jwtpracticeprojekt.entity.Group;
import peaksoft.jwtpracticeprojekt.StudyFormat;

@Getter
@Setter
@Data
public class StudentResponse {
@NotNull
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private StudyFormat studyFormat;
    private Group group;
}
