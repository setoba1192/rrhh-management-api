package com.softcaribbean.rh.application.service.basic;

import java.util.List;

/**
 *
 * @param <T> Objeto DTO a retornar
 * @param <ID> Objeto DTO a enviar
 */
public interface CrudBaseService<T, ID> {

    T findById(ID id);

    List<T> findAll();

    T create(T dto);

    T update(T dto);

    T deleteById(ID id);
}
