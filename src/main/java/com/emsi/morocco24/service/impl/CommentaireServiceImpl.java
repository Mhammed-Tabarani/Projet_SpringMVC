package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsi.morocco24.repository.CommentaireRepository;
import com.emsi.morocco24.service.CommentaireService;

@Service
public class CommentaireServiceImpl implements CommentaireService {
    @Autowired
    CommentaireRepository commentaireRepository;
}
