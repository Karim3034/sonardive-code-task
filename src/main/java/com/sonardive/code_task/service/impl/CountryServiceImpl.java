package com.sonardive.code_task.service.impl;

import com.sonardive.code_task.service.CountryService;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {
    @Override
    public String getName(String isoCode) {
        return "name of " + isoCode;
    }
}
