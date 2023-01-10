package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Country;
import com.example.repository.CountryRepository;

@Service
public class CountryService {
    @Autowired
    private CountryRepository repository;

    public List<Country> getCountries() {
        return repository.findAll();
    }


}
