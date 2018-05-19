package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.Composition;
import com.epitech.screen.fleet.compositionservice.Repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompositionController {

    @Autowired
    private CompositionRepository compositionRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/compositions")
    public List<Composition> getAllCompositions() {
        return compositionRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/compositions/{id}")
    public Optional<Composition> getCompositionById(@PathVariable Long id) {
        return compositionRepository.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/compositions/{id}")
    public String deleteComposition(@PathVariable Long id) {
        System.out.println("DELETE COMPOSITION WITH ID : " + id);
        try {
            compositionRepository.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @CrossOrigin(origins = "http://localhost:8080")
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

    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping("/compositions")
    public Composition updateComposition(@RequestBody Composition composition) {
        System.out.println("REST REQUEST to update Composition : " + composition);
        Composition updatedComp = compositionRepository.save(composition);
        return  updatedComp;
    }
}
