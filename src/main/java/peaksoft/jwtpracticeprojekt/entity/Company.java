package peaksoft.jwtpracticeprojekt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "companies")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
    @Id
    @SequenceGenerator(name = "company_sequence",
            sequenceName = "company_sequence",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(name = "company_id")
    private Long id;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "locatedCountry")
    private String locatedCountry;

    @OneToMany(mappedBy = "company")
    List<Course> courses;
//    private Long companyId;
}
