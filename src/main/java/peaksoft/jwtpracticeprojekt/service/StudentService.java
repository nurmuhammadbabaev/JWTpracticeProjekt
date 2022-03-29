package peaksoft.jwtpracticeprojekt.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.jwtpracticeprojekt.dto.StudentRequest;
import peaksoft.jwtpracticeprojekt.dto.StudentResponse;
import peaksoft.jwtpracticeprojekt.entity.Student;
import peaksoft.jwtpracticeprojekt.mapper.StudentEditMapper;
import peaksoft.jwtpracticeprojekt.mapper.StudentViewMapper;
import peaksoft.jwtpracticeprojekt.repository.GroupRepository;
import peaksoft.jwtpracticeprojekt.repository.StudentRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentViewMapper viewMapper;
    private final StudentRepository repository;
    private final StudentEditMapper editMapper;
    private final GroupRepository groupRepository;

    public StudentResponse create(StudentRequest studentRequest){
        return viewMapper.viewStudent(repository.save(editMapper.create(studentRequest)));
    }

    public StudentResponse update(Long id,StudentRequest studentRequest){
        Student student=repository.findById(id).get();
        editMapper.update(student,studentRequest);
        return viewMapper.viewStudent(repository.save(student));
    }
    public StudentResponse getById(Long id){


        return viewMapper.viewStudent(repository.findById(id).get());
    }

    public StudentResponse deleteById(Long id){
        Student student=repository.findById(id).get();
        repository.deleteById(id);
        return viewMapper.viewStudent(student);
    }
    public List<StudentResponse> getAllStudent(){
        return viewMapper.viewStudents(repository.findAll());
    }

}
