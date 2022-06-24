package com.emsi.morocco24.service;

import com.emsi.morocco24.entity.Lecteur;

public interface LecteurService {
    Lecteur saveLecteur(Lecteur lecteur);
    void followJournalist(String articlePublicId);

    Lecteur getLecteur(String email);

    void unfollowJournalist(String articlePublicId);
}
