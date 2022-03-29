package peaksoft.jwtpracticeprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.jwtpracticeprojekt.dto.TeacherRequest;
import peaksoft.jwtpracticeprojekt.entity.Teacher;

@Component
public class TeacherEditMapper {

    public Teacher create(TeacherRequest teacherRequest){
     if(teacherRequest==null){
         return null;
     }
     Teacher teacher=new Teacher();
     teacher.setFirstName(teacherRequest.getFirstName());
     teacher.setLastName(teacherRequest.getLastName());
     teacher.setEmail(teacherRequest.getEmail());
        return teacher;
    }

    public Teacher update(Teacher teacher,TeacherRequest teacherRequest){
        teacher.setFirstName(teacherRequest.getFirstName());
        teacher.setLastName(teacherRequest.getLastName());
        teacher.setEmail(teacherRequest.getEmail());
        return teacher;
    }
}
