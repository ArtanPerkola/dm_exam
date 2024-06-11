package ch.zhaw.criminalcase.repository;

import ch.zhaw.criminalcase.entity.Multiple;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MultipleRepository extends JpaRepository<Multiple, Long> {
}
