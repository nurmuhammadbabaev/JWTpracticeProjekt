package peaksoft.jwtpracticeprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.jwtpracticeprojekt.dto.GroupResponse;
import peaksoft.jwtpracticeprojekt.dto.StudentResponse;
import peaksoft.jwtpracticeprojekt.entity.Student;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentViewMapper {

    public StudentResponse viewStudent(Student student){
        if(student==null){
            return null;
        }
        StudentResponse studentResponse=new StudentResponse();
        if(student.getId()!=null){
           studentResponse.setId(student.getId());
        }
        studentResponse.setFirstName(student.getFirstName());
        studentResponse.setLastName(student.getLastName());
        studentResponse.setEmail(student.getEmail());

        return studentResponse;
    }
    public List<StudentResponse> viewStudents(List<Student> students){
        List<StudentResponse>studentResponses=new ArrayList<>();
        for (Student s:students) {
            studentResponses.add(viewStudent(s));
        }
        return studentResponses;
    }
}
