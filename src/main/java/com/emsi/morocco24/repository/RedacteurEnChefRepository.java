package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.morocco24.entity.RedacteurEnChef;

@Repository
public interface RedacteurEnChefRepository extends JpaRepository<RedacteurEnChef,Long> {
    RedacteurEnChef findByEmail(String email);
}
