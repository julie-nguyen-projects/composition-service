package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.SplitView;
import com.epitech.screen.fleet.compositionservice.Repository.SplitViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SplitViewController {
    @Autowired
    private SplitViewRepository splitViewRepository;

    @GetMapping("/split-views")
    public List<SplitView> getAllCompositions() {
        return splitViewRepository.findAll();
    }

    @GetMapping("/split-views/{id}")
    public Optional<SplitView> getCompositionById(@PathVariable Long id) {
        return splitViewRepository.findById(id);
    }

    @DeleteMapping("split-views/{id}")
    public String deleteComposition(@PathVariable Long id) {
        System.out.println("DELETE COMPOSITION WITH ID : " + id);
        try {
            splitViewRepository.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @PostMapping("/split-views")
    public SplitView createComposition(@RequestBody SplitView splitView) {
        System.out.println("REST REQUEST to save SplitView : " + splitView);

        if (splitView.getId() != null) {
            System.out.println("A new splitView cannot have an ID");
            return null;
        }
        SplitView newSplitView = splitViewRepository.save(splitView);
        return newSplitView;
    }

    @PutMapping("/split-views")
    public SplitView updateComposition(@RequestBody SplitView splitView) {
        System.out.println("REST REQUEST to update SplitView : " + splitView);
        SplitView updatedSplitView = splitViewRepository.save(splitView);
        return  updatedSplitView;
    }
}
