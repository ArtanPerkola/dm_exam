package ch.zhaw.criminalcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.criminalcase.entity.Defendant;

public interface DefendantRepository extends JpaRepository<Defendant, Long> {
}
