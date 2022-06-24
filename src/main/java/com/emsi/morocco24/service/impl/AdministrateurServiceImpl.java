package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsi.morocco24.repository.AdministrateurRepository;
import com.emsi.morocco24.service.AdministrateurService;

@Service
public class AdministrateurServiceImpl implements AdministrateurService {
    @Autowired
    AdministrateurRepository administrateurRepository;

}
