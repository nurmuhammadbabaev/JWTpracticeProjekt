package peaksoft.jwtpracticeprojekt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "teachers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Teacher {
    @Id
    @SequenceGenerator(name = "teacher_sequence",
            sequenceName = "teacher_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "teacher_id")
    private Long id;
    @Column(name = "teacher_firstname")
    private String firstName;
    @Column(name = "teacher_lastname")
    private String lastName;
    @Column(name = "teacher_email")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id")
    private Course course;
}
