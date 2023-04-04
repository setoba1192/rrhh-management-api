package com.softcaribbean.rh.infraestructure.repository.empleado;

import com.softcaribbean.rh.domain.model.empleado.InformacionLaboralEmpleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformacionLaboralEmpleadoRepository extends JpaRepository<InformacionLaboralEmpleado, Long> {
}