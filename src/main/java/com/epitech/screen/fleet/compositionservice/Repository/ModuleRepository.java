package com.epitech.screen.fleet.compositionservice.Repository;

import com.epitech.screen.fleet.compositionservice.Model.AModule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModuleRepository extends JpaRepository<AModule, Long> {
}
