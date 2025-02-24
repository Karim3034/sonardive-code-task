package com.sonardive.code_task.mapper;

import com.sonardive.code_task.dto.CompanyDto;
import com.sonardive.code_task.dto.CountryDto;
import com.sonardive.code_task.entity.Company;
import com.sonardive.code_task.entity.Country;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CompanyMapperUnitTest {

    @Mock
    private CountryMapper countryMapper;
    @InjectMocks
    private CompanyMapperImpl companyMapper;

    @Test
    public void testToDto(){
        Country country = new Country(1,"EG");
        Company company = new Company(10,"xyz company",country);
        CountryDto countryDto = new CountryDto(1,"Egypt");
        when(countryMapper.toDto(country)).thenReturn(countryDto);
        CompanyDto companyDto = companyMapper.toDto(company);
        assertThat(companyDto.id()).isEqualTo(10);
        assertThat(companyDto.name()).isEqualTo("xyz company");
        assertThat(companyDto.country()).isEqualTo(countryDto);
    }
}
