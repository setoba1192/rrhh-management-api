package com.softcaribbean.rh.infraestructure.repository.empleado;

import com.softcaribbean.rh.domain.model.empleado.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabilidadRepository extends JpaRepository<Habilidad, Long> {
}