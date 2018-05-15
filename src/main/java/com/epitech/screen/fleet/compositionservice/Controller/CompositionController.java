package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.Composition;
import com.epitech.screen.fleet.compositionservice.Repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class CompositionController {

    @Autowired
    private CompositionRepository compositionRepository;

    @GetMapping("/compositions")
    public List<Composition> getAllCompositions() {
        return compositionRepository.findAll();
    }

    @GetMapping("/compositions/{id}")
    public Optional<Composition> getCompositionById(@PathVariable Long id) {
        return compositionRepository.findById(id);
    }

    @DeleteMapping("compositions/{id}")
    public String deleteComposition(@PathVariable Long id) {
        System.out.println("DELETE COMPOSITION WITH ID : " + id);
        try {
            compositionRepository.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @PostMapping("/compositions")
    public Composition createComposition(@RequestBody Composition composition) {
        System.out.println("REST REQUEST to save Composition : " + composition);

        if (composition.getId() != null) {
            System.out.println("A new composition cannot have an ID");
            return null;
        }
        Composition newComp = compositionRepository.save(composition);
        return newComp;
    }

    @PutMapping("/compositions")
    public Composition updateComposition(@RequestBody Composition composition) {
        System.out.println("REST REQUEST to update Composition : " + composition);
        Composition updatedComp = compositionRepository.save(composition);
        return  updatedComp;
    }
}
