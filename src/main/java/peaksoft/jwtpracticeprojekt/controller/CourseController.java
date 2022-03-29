package peaksoft.jwtpracticeprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.jwtpracticeprojekt.dto.CompanyRequest;
import peaksoft.jwtpracticeprojekt.dto.CompanyResponse;
import peaksoft.jwtpracticeprojekt.dto.CourseRequest;
import peaksoft.jwtpracticeprojekt.dto.CourseResponse;
import peaksoft.jwtpracticeprojekt.service.CourseService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{compId}/course")
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    public CourseResponse create(@RequestBody @Valid CourseRequest courseRequest,@PathVariable("compId")Long id){
        return courseService.create(id,courseRequest);
    }

    @PutMapping("{id}")
    public CourseResponse update(@PathVariable Long id,@RequestBody CourseRequest courseRequest){
        return courseService.update(id,courseRequest);
    }
    @GetMapping("{id}")
    public CourseResponse getById(@PathVariable Long id){
        return courseService.getCourse(id);
    }
    @DeleteMapping("{id}")
    public CourseResponse deleteById(@PathVariable Long id){
        return courseService.deleteById(id);
    }
    @GetMapping("/all")
    public List<CourseResponse> getAllCourse(){
        return courseService.getAllCourse();
    }
}
