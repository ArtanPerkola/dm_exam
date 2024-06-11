package ch.zhaw.criminalcase.controller;

import ch.zhaw.criminalcase.entity.Crime;
import ch.zhaw.criminalcase.repository.CrimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/crimes")
public class CrimeController {

    @Autowired
    private CrimeRepository crimeRepository;

    @GetMapping
    public List<Crime> getAllCrimes() {
        return crimeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Crime getCrimeById(@PathVariable Long id) {
        return crimeRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Crime createCrime(@RequestBody Crime crime) {
        return crimeRepository.save(crime);
    }

    @PutMapping("/{id}")
    public Crime updateCrime(@PathVariable Long id, @RequestBody Crime crime) {
        crime.setId(id);
        return crimeRepository.save(crime);
    }

    @DeleteMapping("/{id}")
    public void deleteCrime(@PathVariable Long id) {
        crimeRepository.deleteById(id);
    }
}
