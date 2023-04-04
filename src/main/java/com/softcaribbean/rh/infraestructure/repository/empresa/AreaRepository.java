package com.softcaribbean.rh.infraestructure.repository.empresa;

import com.softcaribbean.rh.domain.model.empresa.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaRepository extends JpaRepository<Area, Long> {
}