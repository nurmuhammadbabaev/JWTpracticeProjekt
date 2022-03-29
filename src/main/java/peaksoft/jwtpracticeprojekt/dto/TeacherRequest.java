package peaksoft.jwtpracticeprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TeacherRequest {
    @NotNull
    private String firstName;
    private String lastName;
    private String email;

}
