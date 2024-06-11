package ch.zhaw.criminalcase.controller;

import ch.zhaw.criminalcase.entity.Multiple;
import ch.zhaw.criminalcase.repository.MultipleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/multiples")
public class MultipleController {

    @Autowired
    private MultipleRepository multipleRepository;

    @GetMapping
    public List<Multiple> getAllMultiples() {
        return multipleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Multiple getMultipleById(@PathVariable Long id) {
        return multipleRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Multiple createMultiple(@RequestBody Multiple multiple) {
        return multipleRepository.save(multiple);
    }

    @PutMapping("/{id}")
    public Multiple updateMultiple(@PathVariable Long id, @RequestBody Multiple multiple) {
        multiple.setId(id);
        return multipleRepository.save(multiple);
    }

    @DeleteMapping("/{id}")
    public void deleteMultiple(@PathVariable Long id) {
        multipleRepository.deleteById(id);
    }
}
