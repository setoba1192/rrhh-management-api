package com.softcaribbean.rh.infraestructure.repository.estado;

import com.softcaribbean.rh.domain.model.estado.EntidadEstado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntidadEstadoRepository extends JpaRepository<EntidadEstado, Long> {
}