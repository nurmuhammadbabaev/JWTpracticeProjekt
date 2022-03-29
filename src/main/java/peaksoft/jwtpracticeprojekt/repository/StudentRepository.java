package peaksoft.jwtpracticeprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import peaksoft.jwtpracticeprojekt.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student,Long> {
    @Override
    List<Student> findAll();

    @Override
    <S extends Student> S save(S entity);

    @Override
    Optional<Student> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
