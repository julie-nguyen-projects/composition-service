package com.epitech.screen.fleet.compositionservice.Controller;

import com.epitech.screen.fleet.compositionservice.Model.SlideView;
import com.epitech.screen.fleet.compositionservice.Repository.SlideViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SlideViewController {

    @Autowired
    private SlideViewRepository slideViewRepository;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/slides-views")
    public List<SlideView> getAllSlidesViews() {
        return slideViewRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/slides-views/{id}")
    public Optional<SlideView> getSlideViewById(@PathVariable Long id) {
        return slideViewRepository.findById(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @DeleteMapping("/slides-views/{id}")
    public String deleteSlideView(@PathVariable Long id) {
        System.out.println("DELETE SlideView WITH ID : " + id);
        try {
            slideViewRepository.deleteById(id);
        } catch (Exception e) {
            return "Error";
        }
        return "Done";
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/slides-views")
    public SlideView createSlideView(@RequestBody SlideView slideView) {
        System.out.println("REST REQUEST to save SlideView : " + slideView);

        if (slideView.getId() != null) {
            System.out.println("A new slideView cannot have an ID");
            return null;
        }
        SlideView newSlideView = slideViewRepository.save(slideView);
        return newSlideView;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PutMapping("/slides-views")
    public SlideView updateComposition(@RequestBody SlideView slideView) {
        System.out.println("REST REQUEST to update slideView : " + slideView);
        SlideView updatedSlideView = slideViewRepository.save(slideView);
        return  updatedSlideView;
    }
}
