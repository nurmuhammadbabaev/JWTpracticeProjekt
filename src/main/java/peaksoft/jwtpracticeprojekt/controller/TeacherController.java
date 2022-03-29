package peaksoft.jwtpracticeprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.jwtpracticeprojekt.dto.TeacherRequest;
import peaksoft.jwtpracticeprojekt.dto.TeacherResponse;
import peaksoft.jwtpracticeprojekt.service.TeacherService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/teacher")
public class TeacherController {
    private final TeacherService service;

    @PostMapping
    public TeacherResponse create(@RequestBody @Valid TeacherRequest teacherRequest){
        return service.create(teacherRequest);
    }
    @PutMapping("{id}")
    public TeacherResponse update(@PathVariable Long id,@RequestBody TeacherRequest teacherRequest){
        return service.update(id, teacherRequest);
    }
    @GetMapping("{id}")
    public TeacherResponse getById(@PathVariable Long id){
        return service.getById(id);
    }
    @DeleteMapping("{id}")
    public TeacherResponse deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
    @GetMapping("/all")
    public List<TeacherResponse> getAllTeacher(){
        return service.getAllTeacher();
    }

}
