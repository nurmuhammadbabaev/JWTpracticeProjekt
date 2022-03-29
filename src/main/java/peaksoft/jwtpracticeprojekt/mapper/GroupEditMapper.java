package peaksoft.jwtpracticeprojekt.mapper;

import org.springframework.stereotype.Component;
import peaksoft.jwtpracticeprojekt.dto.GroupRequest;
import peaksoft.jwtpracticeprojekt.entity.Course;
import peaksoft.jwtpracticeprojekt.entity.Group;

import java.util.List;

@Component
public class GroupEditMapper {

    public Group create(Course course, GroupRequest groupRequest) {
        if (groupRequest == null) {
            return null;
        }
        Group group = new Group();
        group.setGroupName(groupRequest.getGroupName());
        group.setDateOfStart(groupRequest.getDateOfStart());
        group.setDateOfFinish(groupRequest.getDateOfFinish());
        group.setCourse((List<Course>) course);
        return group;
    }

    public Group update(Group group, GroupRequest groupRequest) {

        group.setGroupName(groupRequest.getGroupName());
        group.setDateOfStart(groupRequest.getDateOfStart());
        group.setDateOfFinish(groupRequest.getDateOfFinish());

        return group;

    }
}
