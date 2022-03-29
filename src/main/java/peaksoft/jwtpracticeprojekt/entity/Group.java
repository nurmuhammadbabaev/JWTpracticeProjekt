package peaksoft.jwtpracticeprojekt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "groups")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Group {
    @Id
    @SequenceGenerator(name = "group_sequence",
            sequenceName = "group_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "group_id")
    private Long id;
    @Column(name = "group_name")
    private String groupName;
    @Column(name = "date_of_start")
    private String dateOfStart;
    @Column(name = "date_of_finish")
    private String dateOfFinish;

    @JsonIgnore
    @ManyToMany(cascade =CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "course_group",
            joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "group_id"))
    private List<Course> course;

    @OneToMany(mappedBy = "group")
    private List<Student>students;

}
