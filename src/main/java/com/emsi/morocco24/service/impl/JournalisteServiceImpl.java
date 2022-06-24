package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsi.morocco24.entity.Journaliste;
import com.emsi.morocco24.repository.JournalisteRepository;
import com.emsi.morocco24.service.JournalisteService;

import java.util.List;

@Service
public class JournalisteServiceImpl implements JournalisteService {
    @Autowired
    JournalisteRepository journalisteRepository;

    @Override
    public List<Journaliste> getAllJournalistes() {
        return journalisteRepository.findAll();
    }
}
