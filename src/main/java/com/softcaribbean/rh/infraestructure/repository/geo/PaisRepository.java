package com.softcaribbean.rh.infraestructure.repository.geo;

import com.softcaribbean.rh.domain.model.geo.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}