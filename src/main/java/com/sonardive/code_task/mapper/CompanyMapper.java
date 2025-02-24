package com.sonardive.code_task.mapper;

import com.sonardive.code_task.dto.CompanyDto;
import com.sonardive.code_task.entity.Company;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = {CountryMapper.class})
public interface CompanyMapper {
    CompanyDto toDto(Company company);
}
