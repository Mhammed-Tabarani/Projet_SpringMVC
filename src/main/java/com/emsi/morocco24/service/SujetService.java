package com.emsi.morocco24.service;

import java.util.List;

import com.emsi.morocco24.entity.Sujet;

public interface SujetService {

    List<Sujet> getAllSujets();

    void saveSujet(Sujet sujet);

    Sujet getSujet(String subjectPublicId);

    void updateSujet(Sujet sujet, String subjectPublicId);

    void deleteSujet(String subjectPublicId);
}
