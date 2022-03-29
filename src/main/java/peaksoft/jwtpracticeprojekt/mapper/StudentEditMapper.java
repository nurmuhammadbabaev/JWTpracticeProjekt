package peaksoft.jwtpracticeprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.jwtpracticeprojekt.dto.StudentRequest;
import peaksoft.jwtpracticeprojekt.entity.Student;

import java.nio.charset.StandardCharsets;

@Component
public class StudentEditMapper {

    public Student create(StudentRequest studentRequest){
        if (studentRequest==null){
            return null;
        }
        Student student=new Student();
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
//        student.setStudyFormat(studentRequest.getStudyFormat());
        student.setEmail(studentRequest.getEmail());
        return student;
    }

    public Student update(Student student,StudentRequest studentRequest){
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
//        student.setStudyFormat(studentRequest.getStudyFormat());
        student.setEmail(studentRequest.getEmail());
        return student;
    }
}
