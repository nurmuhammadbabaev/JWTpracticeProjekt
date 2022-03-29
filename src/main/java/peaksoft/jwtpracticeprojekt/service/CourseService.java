package peaksoft.jwtpracticeprojekt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.jwtpracticeprojekt.dto.CompanyRequest;
import peaksoft.jwtpracticeprojekt.dto.CourseRequest;
import peaksoft.jwtpracticeprojekt.dto.CourseResponse;
import peaksoft.jwtpracticeprojekt.entity.Company;
import peaksoft.jwtpracticeprojekt.entity.Course;
import peaksoft.jwtpracticeprojekt.mapper.CourseEditMapper;
import peaksoft.jwtpracticeprojekt.mapper.CourseViewMapper;
import peaksoft.jwtpracticeprojekt.repository.CompanyRepository;
import peaksoft.jwtpracticeprojekt.repository.CourseRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseViewMapper courseViewMapper;
    private final CourseEditMapper courseEditMapper;
    private final CourseRepository courseRepository;
    private final CompanyRepository companyRepository;

    public CourseResponse create(Long id, CourseRequest courseRequest) {
        Company company = companyRepository.findById(id).get();
        return courseViewMapper.viewCourse(courseRepository.
                save(courseEditMapper.create(company,courseRequest)));
    }

    public CourseResponse update(Long id, CourseRequest courseRequest) {
        Course course = courseRepository.findById(id).get();
        courseEditMapper.update(course, courseRequest);
        return courseViewMapper.viewCourse(courseRepository.save(course));
    }

    public CourseResponse getCourse(Long id) {
        return courseViewMapper.viewCourse(courseRepository.findById(id).get());
    }

    public CourseResponse deleteById(Long id) {
        Course course = courseRepository.findById(id).get();
        courseRepository.deleteById(id);
        return courseViewMapper.viewCourse(course);
    }

    public List<CourseResponse> getAllCourse() {
        return courseViewMapper.viewCourses(courseRepository.findAll());
    }
}
