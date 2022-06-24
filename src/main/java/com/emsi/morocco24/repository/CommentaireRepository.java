package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.morocco24.entity.Commentaire;

@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire,Long> {
}
