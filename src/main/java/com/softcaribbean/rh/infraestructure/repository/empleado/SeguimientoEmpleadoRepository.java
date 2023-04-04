package com.softcaribbean.rh.infraestructure.repository.empleado;

import com.softcaribbean.rh.domain.model.empleado.SeguimientoEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguimientoEmpleadoRepository extends JpaRepository<SeguimientoEmpleado, Long> {
}