package com.softcaribbean.rh.infraestructure.repository.empleado;

import com.softcaribbean.rh.domain.model.empleado.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {
}