package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.BaseModule;
import com.epitech.screen.fleet.compositionservice.Repository.BaseModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BaseModuleController {
    
    @Autowired
    private BaseModuleRepository baseModuleRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/base-modules")
    public List<BaseModule> getAllBaseModules() {
        return baseModuleRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/base-modules/{id}")
    public Optional<BaseModule> getBaseModuleById(@PathVariable Long id) {
        return baseModuleRepository.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("base-modules/{id}")
    public String deleteBaseModule(@PathVariable Long id) {
        System.out.println("DELETE BaseModule WITH ID : " + id);
        try {
            baseModuleRepository.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/base-modules")
    public BaseModule createBaseModule(@RequestBody BaseModule baseModule) {
        System.out.println("REST REQUEST to save BaseModule : " + baseModule);

        if (baseModule.getId() != null) {
            System.out.println("A new composition cannot have an ID");
            return null;
        }
        // TODO retrouver le média grâce au service média
        BaseModule newBaseModule = baseModuleRepository.save(baseModule);
        return newBaseModule;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping("/base-modules")
    public BaseModule updateBaseModule(@RequestBody BaseModule baseModule) {
        System.out.println("REST REQUEST to update BaseModule : " + baseModule);
        BaseModule updatedBaseModule = baseModuleRepository.save(baseModule);
        return  updatedBaseModule;
    }
}
