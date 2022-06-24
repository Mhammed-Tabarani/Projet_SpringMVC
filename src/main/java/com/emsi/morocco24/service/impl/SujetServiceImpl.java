package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsi.morocco24.entity.Sujet;
import com.emsi.morocco24.repository.SujetRepository;
import com.emsi.morocco24.service.SujetService;
import com.emsi.morocco24.shared.Utils;

import java.util.List;

@Service
public class SujetServiceImpl implements SujetService {
    @Autowired
    SujetRepository sujetRepository;

    @Autowired
    Utils utils;

    @Override
    public List<Sujet> getAllSujets() {
        return sujetRepository.findAll();
    }

    @Override
    public void saveSujet(Sujet sujet) {
        sujet.setPublicId(utils.genereteRandomString(30));
        sujetRepository.save(sujet);
    }

    @Override
    public Sujet getSujet(String subjectPublicId) {
        return  sujetRepository.findByPublicId(subjectPublicId);
    }

    @Override
    public void updateSujet(Sujet sujet, String subjectPublicId) {
        Sujet s=sujetRepository.findByPublicId(subjectPublicId);
        s.setSujet(sujet.getSujet());
        sujetRepository.save(s);
    }

    @Override
    public void deleteSujet(String subjectPublicId) {
        sujetRepository.deleteByPublicId(subjectPublicId);
    }

}
