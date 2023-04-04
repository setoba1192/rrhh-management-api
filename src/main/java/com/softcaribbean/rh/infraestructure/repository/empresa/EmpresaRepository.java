package com.softcaribbean.rh.infraestructure.repository.empresa;

import com.softcaribbean.rh.domain.model.empresa.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}