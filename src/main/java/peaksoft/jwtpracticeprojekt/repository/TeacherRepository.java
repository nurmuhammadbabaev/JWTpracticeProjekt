package peaksoft.jwtpracticeprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import peaksoft.jwtpracticeprojekt.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    @Override
    List<Teacher> findAll();

    @Override
    <S extends Teacher> S save(S entity);

    @Override
    Optional<Teacher> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
