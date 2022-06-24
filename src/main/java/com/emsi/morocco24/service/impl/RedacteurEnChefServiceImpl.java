package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emsi.morocco24.repository.RedacteurEnChefRepository;
import com.emsi.morocco24.service.RedacteurEnChefService;

@Service
public class RedacteurEnChefServiceImpl implements RedacteurEnChefService {
    @Autowired
    RedacteurEnChefRepository redacteurEnChefRepository;
}
