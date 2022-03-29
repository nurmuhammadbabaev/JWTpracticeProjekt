package peaksoft.jwtpracticeprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import peaksoft.jwtpracticeprojekt.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {
    @Override
    List<Course> findAll();

    @Override
    <S extends Course> S save(S entity);

    @Override
    Optional<Course> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
