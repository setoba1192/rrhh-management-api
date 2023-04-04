package com.softcaribbean.rh.infraestructure.repository.lista;

import com.softcaribbean.rh.domain.model.lista.ListaElemento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ListaElementoRepository extends JpaRepository<ListaElemento, Long> {
}