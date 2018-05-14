package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.AModule;
import com.epitech.screen.fleet.compositionservice.Repository.ModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ModuleController {

    @Autowired
    private ModuleRepository moduleRepository;

    @GetMapping("/modules")
    public List<AModule> getAllModules() {
        return moduleRepository.findAll();
    }
}
