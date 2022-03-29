package peaksoft.jwtpracticeprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import peaksoft.jwtpracticeprojekt.entity.Company;

@Getter
@Setter
@Data
public class CourseRequest {
    @NotNull
    private String courseName;
    private String duration;
    private  Long companyId;

}
