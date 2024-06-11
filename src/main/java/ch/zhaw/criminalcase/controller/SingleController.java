package ch.zhaw.criminalcase.controller;

import ch.zhaw.criminalcase.entity.Single;
import ch.zhaw.criminalcase.repository.SingleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/singles")
public class SingleController {

    @Autowired
    private SingleRepository singleRepository;

    @GetMapping
    public List<Single> getAllSingles() {
        return singleRepository.findAll();
    }

    @GetMapping("/{id}")
    public Single getSingleById(@PathVariable Long id) {
        return singleRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Single createSingle(@RequestBody Single single) {
        return singleRepository.save(single);
    }

    @PutMapping("/{id}")
    public Single updateSingle(@PathVariable Long id, @RequestBody Single single) {
        single.setId(id);
        return singleRepository.save(single);
    }

    @DeleteMapping("/{id}")
    public void deleteSingle(@PathVariable Long id) {
        singleRepository.deleteById(id);
    }
}
