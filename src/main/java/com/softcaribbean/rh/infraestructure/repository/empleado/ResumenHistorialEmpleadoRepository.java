package com.softcaribbean.rh.infraestructure.repository.empleado;

import com.softcaribbean.rh.domain.model.empleado.ResumenHistorialEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResumenHistorialEmpleadoRepository extends JpaRepository<ResumenHistorialEmpleado, Long> {
}