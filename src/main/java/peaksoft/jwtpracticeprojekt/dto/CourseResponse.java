package peaksoft.jwtpracticeprojekt.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import peaksoft.jwtpracticeprojekt.entity.Company;
import peaksoft.jwtpracticeprojekt.entity.Group;
import peaksoft.jwtpracticeprojekt.entity.Teacher;


import java.util.List;

@Getter
@Setter
@Data
public class CourseResponse {

    private Long id;
    private String courseName;
    private String duration;
    private Company company;
    private List<Group> groups;
    private Teacher teacher;
}
