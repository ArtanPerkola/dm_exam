package ch.zhaw.criminalcase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.zhaw.criminalcase.entity.Defendant;
import ch.zhaw.criminalcase.repository.DefendantRepository;

import java.util.List;

@Service
public class DefendantService {
    @Autowired
    private DefendantRepository defendantRepository;

    public List<Defendant> getAllDefendants() {
        return defendantRepository.findAll();
    }

    public Defendant createOrUpdateDefendant(Defendant defendant) {
        return defendantRepository.save(defendant);
    }

    public void deleteDefendant(Long id) {
        defendantRepository.deleteById(id);
    }
}
