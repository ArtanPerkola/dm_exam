package ch.zhaw.criminalcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ch.zhaw.criminalcase.entity.Defendant;
import ch.zhaw.criminalcase.service.DefendantService;

import java.util.List;

@RestController
@RequestMapping("/api/defendants")
public class DefendantController {

    @Autowired
    private DefendantService defendantService;

    @GetMapping
    public List<Defendant> getAllDefendants() {
        return defendantService.getAllDefendants();
    }

    @PostMapping
    public Defendant createOrUpdateDefendant(@RequestBody Defendant defendant) {
        return defendantService.createOrUpdateDefendant(defendant);
    }

    @DeleteMapping("/{id}")
    public void deleteDefendant(@PathVariable Long id) {
        defendantService.deleteDefendant(id);
    }
}
