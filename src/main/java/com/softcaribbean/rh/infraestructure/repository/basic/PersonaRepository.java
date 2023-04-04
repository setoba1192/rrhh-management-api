package com.softcaribbean.rh.infraestructure.repository.basic;

import com.softcaribbean.rh.domain.model.basic.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}