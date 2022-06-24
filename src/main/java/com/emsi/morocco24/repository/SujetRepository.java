package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.emsi.morocco24.entity.Sujet;

@Repository
public interface SujetRepository extends JpaRepository<Sujet,Long> {
    Sujet findByPublicId(String publicId);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM sujets WHERE sujets.public_id =?1",nativeQuery = true)
    void deleteByPublicId(String publicId);

}
