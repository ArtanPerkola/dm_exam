package ch.zhaw.criminalcase.controller;

import ch.zhaw.criminalcase.entity.Indictment;
import ch.zhaw.criminalcase.repository.IndictmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/indictments")
public class IndictmentController {

    @Autowired
    private IndictmentRepository indictmentRepository;

    @GetMapping
    public List<Indictment> getAllIndictments() {
        return indictmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Indictment getIndictmentById(@PathVariable Long id) {
        return indictmentRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Indictment createIndictment(@RequestBody Indictment indictment) {
        return indictmentRepository.save(indictment);
    }

    @PutMapping("/{id}")
    public Indictment updateIndictment(@PathVariable Long id, @RequestBody Indictment indictment) {
        indictment.setId(id);
        return indictmentRepository.save(indictment);
    }

    @DeleteMapping("/{id}")
    public void deleteIndictment(@PathVariable Long id) {
        indictmentRepository.deleteById(id);
    }
}
