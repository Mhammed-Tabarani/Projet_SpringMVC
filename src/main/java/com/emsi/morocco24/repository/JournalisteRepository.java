package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.morocco24.entity.Journaliste;

@Repository
public interface JournalisteRepository extends JpaRepository<Journaliste,Long> {
    Journaliste findByEmail(String email);

    Journaliste findByPublicId(String journalistePublicId);
}
