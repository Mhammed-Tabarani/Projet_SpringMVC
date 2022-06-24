package com.emsi.morocco24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.emsi.morocco24.service.AdministrateurService;

@Controller
@RequestMapping("/admins")
public class AdministrateurController {

    @Autowired
    AdministrateurService administrateurService;



    @GetMapping
    public String adminHome()
    {
        return "admin/home";
    }

}
