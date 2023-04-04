package com.softcaribbean.rh.infraestructure.repository.lista;

import com.softcaribbean.rh.domain.model.lista.Lista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaRepository extends JpaRepository<Lista, Long> {
}