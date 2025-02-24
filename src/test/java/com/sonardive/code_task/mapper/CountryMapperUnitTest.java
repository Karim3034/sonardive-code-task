package com.sonardive.code_task.mapper;

import com.sonardive.code_task.dto.CountryDto;
import com.sonardive.code_task.entity.Country;
import com.sonardive.code_task.service.CountryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CountryMapperUnitTest {
    @Mock
    private CountryService countryService;
    @InjectMocks
    private CountryMapperImpl countryMapper;

    @Test
    public void testToDto(){
        Country country = new Country(1,"EG");
        when(countryService.getName("EG")).thenReturn("Egypt");
        CountryDto countryDto = countryMapper.toDto(country);
        assertThat(countryDto.id()).isEqualTo(1);
        assertThat(countryDto.name()).isEqualTo("Egypt");
    }

}
