package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.Composition;
import com.epitech.screen.fleet.compositionservice.Repository.CompositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompositionController {

    @Autowired
    private CompositionRepository compositionRepository;

    @GetMapping("/compositions")
    public List<Composition> getAllCompositions() {
        return compositionRepository.findAll();
    }

}
