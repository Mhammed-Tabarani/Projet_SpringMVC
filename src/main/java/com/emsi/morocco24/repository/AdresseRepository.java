package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.morocco24.entity.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse,Long> {
}
