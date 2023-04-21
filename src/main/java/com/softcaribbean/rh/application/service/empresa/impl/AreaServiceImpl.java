package com.softcaribbean.rh.application.service.empresa.impl;

import com.softcaribbean.rh.application.exception.ResourceNotFoundException;
import com.softcaribbean.rh.application.service.empresa.AreaService;
import com.softcaribbean.rh.domain.dto.empresa.AreaDto;
import com.softcaribbean.rh.infraestructure.mapper.empresa.AreaMapper;
import com.softcaribbean.rh.infraestructure.repository.empresa.AreaRepository;
import com.softcaribbean.rh.infraestructure.util.MensajesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class AreaServiceImpl implements AreaService {

    private final MensajesService mensajesService;

    private final AreaRepository areaRepository;

    private final AreaMapper areaMapper;

    @Override
    public AreaDto findById(Long id) {
        return areaMapper.toDto(areaRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(mensajesService.getMensaje("global.resource.notfound"))));
    }

    @Override
    public List<AreaDto> findAll() {
        return areaRepository.findAll()
                .stream()
                .map(area -> areaMapper.toDto(area))
                .collect(Collectors.toList());
    }

    @Override
    public AreaDto create(AreaDto areaDto) {

        return areaMapper.toDto(areaRepository.save(areaMapper.toEntity(areaDto)));
    }

    @Override
    public AreaDto update(AreaDto dto) {
        return null;
    }

    @Override
    public AreaDto deleteById(Long aLong) {
        return null;
    }
}
