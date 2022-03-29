package peaksoft.jwtpracticeprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import peaksoft.jwtpracticeprojekt.entity.Course;
import java.util.List;
@Getter
@Setter
@Data
public class CompanyResponse {
    @NotNull

    private Long id;
    private String companyName;
    private String locatedCountry;
    List<Course> courses;
}
