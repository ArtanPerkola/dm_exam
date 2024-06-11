package ch.zhaw.criminalcase.repository;

import ch.zhaw.criminalcase.entity.Single;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingleRepository extends JpaRepository<Single, Long> {
}
