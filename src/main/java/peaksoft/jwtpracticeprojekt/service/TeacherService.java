package peaksoft.jwtpracticeprojekt.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.jwtpracticeprojekt.dto.TeacherRequest;
import peaksoft.jwtpracticeprojekt.dto.TeacherResponse;
import peaksoft.jwtpracticeprojekt.entity.Teacher;
import peaksoft.jwtpracticeprojekt.mapper.TeacherEditMapper;
import peaksoft.jwtpracticeprojekt.mapper.TeacherViewMapper;
import peaksoft.jwtpracticeprojekt.repository.CourseRepository;
import peaksoft.jwtpracticeprojekt.repository.TeacherRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherService {
    private final TeacherViewMapper viewMapper;
    private final TeacherRepository repository;
    private final TeacherEditMapper editMapper;
    private final CourseRepository courseRepository;

    public TeacherResponse create(TeacherRequest teacherRequest){
        return viewMapper.viewTeacher(repository.save(editMapper.create(teacherRequest)));
    }

    public TeacherResponse update(Long id,TeacherRequest teacherRequest){
        Teacher teacher=repository.findById(id).get();
        editMapper.update(teacher,teacherRequest);
        return viewMapper.viewTeacher(repository.save(teacher));
    }

    public TeacherResponse getById(Long id){
        return viewMapper.viewTeacher(repository.findById(id).get());
    }

    public TeacherResponse deleteById(Long id){
        Teacher teacher=repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewTeacher(teacher);
    }

    public List<TeacherResponse> getAllTeacher(){
        return viewMapper.viewTeachers(repository.findAll());
    }


}
