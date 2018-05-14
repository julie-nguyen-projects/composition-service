package com.epitech.screen.fleet.compositionservice.Repository;

import com.epitech.screen.fleet.compositionservice.Model.Composition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositionRepository extends JpaRepository<Composition, Long> {
}
