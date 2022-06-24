package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emsi.morocco24.entity.SuivreJournaliste;
import com.emsi.morocco24.repository.SuivreJournalisteRepository;
import com.emsi.morocco24.service.SuirvreJournalisteService;

@Service
public class SuivreJournalisteServiceImpl implements SuirvreJournalisteService {
    @Autowired
    SuivreJournalisteRepository suivreJournalisteRepository;

    @Override
    public void deleteSuivreJournalisteService(SuivreJournaliste suivreJournaliste) {
        suivreJournalisteRepository.deleteByPublicId(suivreJournaliste.getPublicId());
    }
}
