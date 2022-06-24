package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsi.morocco24.entity.Adresse;
import com.emsi.morocco24.repository.AdresseRepository;
import com.emsi.morocco24.service.AdresseService;

import java.util.List;

@Service
public class AdresseServiceImpl implements AdresseService {
    @Autowired
    AdresseRepository adresseRepository;


    @Override
    public List<Adresse> getAllAdresses() {
        return null;
    }
}
