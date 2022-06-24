package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.morocco24.entity.Administrateur;

@Repository
public interface AdministrateurRepository extends JpaRepository<Administrateur,Long> {
    
    Administrateur findByEmail(String email);
    
}
