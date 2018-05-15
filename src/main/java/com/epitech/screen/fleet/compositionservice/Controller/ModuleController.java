package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.AModule;
import com.epitech.screen.fleet.compositionservice.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ModuleController {

    @Autowired
    private ModuleRepository moduleRepository;

    @GetMapping("/modules")
    public List<AModule> getAllModules() {
        return moduleRepository.findAll();
    }

    @GetMapping("/modules/{id}")
    public Optional<AModule> getModuleById(@PathVariable Long id) {
        return moduleRepository.findById(id);
    }

    @DeleteMapping("/modules/{id}")
    public String deleteModule(@PathVariable Long id) {
        System.out.println("DELETE MODULE WITH ID : " + id);
        try {
            moduleRepository.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @PostMapping("/modules")
    public AModule createComposition(@RequestBody AModule module) {
        System.out.println("REST REQUEST to save AModule : " + module);

        if (module.getId() != null) {
            System.out.println("A new module cannot have an ID");
            return null;
        }
        AModule newModule = moduleRepository.save(module);
        return newModule;
    }

    @PutMapping("/modules")
    public AModule updateComposition(@RequestBody AModule module) {
        System.out.println("REST REQUEST to update AModule : " + module);
        AModule updatedModule = moduleRepository.save(module);
        return  updatedModule;
    }
}
