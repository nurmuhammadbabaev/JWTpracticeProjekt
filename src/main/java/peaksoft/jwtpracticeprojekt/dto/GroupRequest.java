package peaksoft.jwtpracticeprojekt.dto;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GroupRequest {
    @NotNull
    private String groupName;
    private String dateOfStart;
    private String dateOfFinish;
}
