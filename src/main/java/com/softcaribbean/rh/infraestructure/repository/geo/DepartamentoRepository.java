package com.softcaribbean.rh.infraestructure.repository.geo;

import com.softcaribbean.rh.domain.model.geo.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
}