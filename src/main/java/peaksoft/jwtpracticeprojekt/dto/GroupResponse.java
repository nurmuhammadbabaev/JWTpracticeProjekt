package peaksoft.jwtpracticeprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import peaksoft.jwtpracticeprojekt.entity.Course;
import peaksoft.jwtpracticeprojekt.entity.Student;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
public class GroupResponse {
    @NotNull
    private Long id;
    private String groupName;
    private String dateOfStart;
    private String dateOfFinish;
//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(name = "course_group",
//            joinColumns = @JoinColumn(name = "course_id"),
//            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private List<Course> course;
    private List<Student>students;
}
