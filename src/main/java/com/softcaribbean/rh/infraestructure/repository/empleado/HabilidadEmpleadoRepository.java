package com.softcaribbean.rh.infraestructure.repository.empleado;

import com.softcaribbean.rh.domain.model.empleado.HabilidadEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabilidadEmpleadoRepository extends JpaRepository<HabilidadEmpleado, Long> {
}