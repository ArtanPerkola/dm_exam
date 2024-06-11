package ch.zhaw.criminalcase.repository;

import ch.zhaw.criminalcase.entity.Crime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrimeRepository extends JpaRepository<Crime, Long> {
}
