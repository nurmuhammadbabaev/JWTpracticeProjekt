package peaksoft.jwtpracticeprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.jwtpracticeprojekt.dto.StudentRequest;
import peaksoft.jwtpracticeprojekt.dto.StudentResponse;
import peaksoft.jwtpracticeprojekt.service.StudentService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {
    private final StudentService service;

    @PostMapping
    public StudentResponse create(@RequestBody @Valid StudentRequest studentRequest){
        return service.create(studentRequest);
    }
    @PutMapping("{id}")
    public StudentResponse update(@PathVariable Long id,@RequestBody StudentRequest studentRequest){
        return service.update(id, studentRequest);
    }
    @GetMapping("{id}")
    public StudentResponse getById(@PathVariable Long id){
        return service.getById(id);
    }
    @DeleteMapping("{id}")
    public StudentResponse deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
    @GetMapping("/all")
    public List<StudentResponse> getAllStudent(){
        return service.getAllStudent();
    }
}
