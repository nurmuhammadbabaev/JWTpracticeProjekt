package peaksoft.jwtpracticeprojekt.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.jwtpracticeprojekt.dto.CompanyResponse;
import peaksoft.jwtpracticeprojekt.dto.CourseRequest;
import peaksoft.jwtpracticeprojekt.entity.Company;
import peaksoft.jwtpracticeprojekt.entity.Course;

@Component
@RequiredArgsConstructor
public class CourseEditMapper {


    public Course create(Company company, CourseRequest courseRequest) {
        if (courseRequest == null) {
            return null;
        }
        Course course = new Course();
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(courseRequest.getDuration());
        course.setCompany(company);
        return course;
    }

    public Course update(Course course, CourseRequest courseRequest) {
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(courseRequest.getDuration());
        return course;
    }
}
