package com.sonardive.code_task.mapper;

import com.sonardive.code_task.dto.CountryDto;
import com.sonardive.code_task.entity.Country;
import com.sonardive.code_task.service.CountryService;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
public abstract class CountryMapper {
    @Autowired
    protected CountryService countryService;
    @Mapping(target = "name",expression = "java(countryService.getName(country.getIsoCode()))")
    public abstract CountryDto toDto(Country country);
}
