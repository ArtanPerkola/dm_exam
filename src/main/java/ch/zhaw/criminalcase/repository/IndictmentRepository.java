package ch.zhaw.criminalcase.repository;

import ch.zhaw.criminalcase.entity.Indictment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndictmentRepository extends JpaRepository<Indictment, Long> {
}
