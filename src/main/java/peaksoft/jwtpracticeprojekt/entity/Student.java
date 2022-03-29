package peaksoft.jwtpracticeprojekt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import peaksoft.jwtpracticeprojekt.StudyFormat;

import javax.persistence.*;

@Entity
@Table(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    @Id
    @SequenceGenerator(name = "student_sequence",
            sequenceName = "student_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "student_id")
    private Long id;
    @Column(name = "student_firstname")
    private String firstName;
    @Column(name = "student_lastname")
    private String lastName;
    @Column(name = "student_email")
    private String email;
    @Column(name = "studyFormat")
    private StudyFormat studyFormat;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
    private Group group;

}
