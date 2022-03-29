package peaksoft.jwtpracticeprojekt.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.jwtpracticeprojekt.dto.GroupRequest;
import peaksoft.jwtpracticeprojekt.dto.GroupResponse;
import peaksoft.jwtpracticeprojekt.service.GroupService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/{courId}/group")
public class GroupController {
    private final GroupService service;

    @PostMapping
    public GroupResponse create(@RequestBody @Valid GroupRequest groupRequest,@PathVariable("courId")Long id){
        return service.create(id,groupRequest);
    }
    @PutMapping("{id}")
    public GroupResponse update(@PathVariable Long id,@RequestBody GroupRequest groupRequest){
        return service.update(id, groupRequest);
    }
    @GetMapping("{id}")
    public GroupResponse getById(@PathVariable Long id){
        return service.getById(id);
    }
    @DeleteMapping("{id}")
    public GroupResponse deleteById(@PathVariable Long id){
        return service.deleteById(id);
    }
    @GetMapping("/all")
    public List<GroupResponse> getAllGroup(){
        return service.getAllGroup();
    }
}
