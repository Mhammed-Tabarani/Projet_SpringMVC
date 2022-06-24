package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.morocco24.entity.Lecteur;

@Repository
public interface LecteurRepository extends JpaRepository<Lecteur,Long> {
    Lecteur findByEmail(String email);
}
