package com.softcaribbean.rh.infraestructure.repository.geo;

import com.softcaribbean.rh.domain.model.geo.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {
}