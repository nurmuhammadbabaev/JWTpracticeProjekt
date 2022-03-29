package peaksoft.jwtpracticeprojekt.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.jwtpracticeprojekt.dto.GroupRequest;
import peaksoft.jwtpracticeprojekt.dto.GroupResponse;
import peaksoft.jwtpracticeprojekt.entity.Course;
import peaksoft.jwtpracticeprojekt.entity.Group;
import peaksoft.jwtpracticeprojekt.mapper.GroupEditMapper;
import peaksoft.jwtpracticeprojekt.mapper.GroupViewMapper;
import peaksoft.jwtpracticeprojekt.repository.CourseRepository;
import peaksoft.jwtpracticeprojekt.repository.GroupRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {
private final GroupViewMapper viewMapper;
private final GroupRepository repository;
private final GroupEditMapper editMapper;
private final CourseRepository courseRepository;

public GroupResponse create(Long id,GroupRequest groupRequest){
    Course course=courseRepository.findById(id).get();
    return viewMapper.viewGroup(repository.save(editMapper.create(course,groupRequest)));
}

public GroupResponse update(Long id,GroupRequest groupRequest){
    Group group=repository.findById(id).get();
    editMapper.update(group,groupRequest);
    return viewMapper.viewGroup(repository.save(group));
}

public GroupResponse getById(Long id){
    return viewMapper.viewGroup(repository.findById(id).get());
}

public GroupResponse deleteById(Long id){
    Group group=repository.findById(id).get();
    repository.deleteById(id);
    return  viewMapper.viewGroup(group);
}
public List<GroupResponse> getAllGroup(){
    return viewMapper.viewGroups(repository.findAll());
}
}
