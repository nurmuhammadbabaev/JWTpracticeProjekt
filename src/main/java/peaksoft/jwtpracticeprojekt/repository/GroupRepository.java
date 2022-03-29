package peaksoft.jwtpracticeprojekt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import peaksoft.jwtpracticeprojekt.entity.Group;

import java.util.List;
import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group,Long> {
    @Override
    List<Group> findAll();

    @Override
    <S extends Group> S save(S entity);

    @Override
    Optional<Group> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}
