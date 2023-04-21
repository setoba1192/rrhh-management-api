package com.softcaribbean.rh.domain.dto.base;

import com.softcaribbean.rh.domain.dto.estado.EntidadEstadoDto;
import com.softcaribbean.rh.domain.dto.geo.CiudadDto;
import com.softcaribbean.rh.infraestructure.anotation.validation.Age;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonaDto implements Serializable {

    private Long id;

    @NotBlank(message = "{persona.nombre.notBlank}")
    @Size(min = 2, max = 50, message = "{persona.nombre.size}")
    private String nombre;

    @NotBlank(message = "{persona.apellido.notBlank}")
    @Size(min = 2, max = 50, message = "{persona.apellido.size}")
    private String apellido;

    @Past(message = "{persona.fechaNacimiento.past}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Age(value = 18, message = "{persona.fechaNacimiento.age}")
    private LocalDate fechaNacimiento;

    @NotNull(message = "{persona.genero.notNull}")
    private GeneroDto genero;

    @Email(message = "{persona.email.email}")
    @NotBlank(message = "{persona.email.notBlank}")
    private String email;

    @Pattern(regexp = "\\d{8,15}", message = "{persona.telefono.pattern}")
    private String telefono;

    @NotBlank(message = "{persona.direccion.notBlank}")
    @Size(max = 255, message = "{persona.direccion.size}")
    private String direccion;

    @NotNull(message = "{persona.ciudad.notNull}")
    private CiudadDto ciudad;

    private String fotoUrl;

    private EntidadEstadoDto estado;

    private boolean eliminado;
}
