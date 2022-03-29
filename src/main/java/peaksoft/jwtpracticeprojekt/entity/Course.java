package peaksoft.jwtpracticeprojekt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
    @Id
    @SequenceGenerator(name = "course_sequence",
            sequenceName = "course_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "course_id")
    private Long id;
    @Column(name = "course_name")
    private String courseName;
    @Column(name = "duration")
    private String duration;
    @Transient
    private Long companyId;

    @JsonIgnore
    @ManyToOne(cascade =CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToMany(mappedBy = "course")
    private List<Group> groups;

    @OneToOne(mappedBy = "course")
    private Teacher teacher;
}
