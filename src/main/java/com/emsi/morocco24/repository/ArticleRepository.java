package com.emsi.morocco24.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emsi.morocco24.entity.Article;
import com.emsi.morocco24.entity.Journaliste;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
    List<Article> findByJournaliste(Journaliste journaliste);
    Article findByPublicId(String articlePublicId);

}
