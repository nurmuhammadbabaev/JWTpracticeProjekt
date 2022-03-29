package peaksoft.jwtpracticeprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.jwtpracticeprojekt.dto.CourseResponse;
import peaksoft.jwtpracticeprojekt.entity.Course;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseViewMapper {


    public CourseResponse viewCourse(Course course){

        if (course==null){
            return null;
        }
        CourseResponse courseResponse=new CourseResponse();
        if (course.getId()!=null){
            courseResponse.setId(course.getId());
        }
        courseResponse.setCourseName(course.getCourseName());
        courseResponse.setDuration(course.getDuration());
        courseResponse.setCompany(course.getCompany());
        courseResponse.setTeacher(course.getTeacher());
        courseResponse.setGroups(course.getGroups());

        return courseResponse;
    }
    public List<CourseResponse> viewCourses(List<Course> courses){

        List<CourseResponse> courseResponses=new ArrayList<>();
        for (Course c:courses) {
            courseResponses.add(viewCourse(c));
        }
        return courseResponses;
    }
}
