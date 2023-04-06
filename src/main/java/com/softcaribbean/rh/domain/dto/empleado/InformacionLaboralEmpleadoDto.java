package com.softcaribbean.rh.domain.dto.empleado;

import com.softcaribbean.rh.domain.dto.empresa.AreaDto;
import com.softcaribbean.rh.domain.dto.empresa.EmpresaDto;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;


@Data
@Builder
public class InformacionLaboralEmpleadoDto implements Serializable {

    private Long id;

    private EmpleadoDto empleadoDto;

    private BigDecimal salario;

    private CargoDto cargoDto;

    private EmpresaDto empresa;

    private AreaDto area;

    private LocalDate fechaInicio;

}
