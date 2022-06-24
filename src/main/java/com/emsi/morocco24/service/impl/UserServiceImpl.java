package com.emsi.morocco24.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.emsi.morocco24.entity.UserDetailsImpl;
import com.emsi.morocco24.repository.AdministrateurRepository;
import com.emsi.morocco24.repository.JournalisteRepository;
import com.emsi.morocco24.repository.LecteurRepository;
import com.emsi.morocco24.repository.RedacteurEnChefRepository;

@Service
public class UserServiceImpl  implements UserDetailsService {

    @Autowired
    AdministrateurRepository administrateurRepository;
    @Autowired
    JournalisteRepository journalisteRepository;
    @Autowired
    LecteurRepository lecteurRepository;
    @Autowired
    RedacteurEnChefRepository redacteurEnChefRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        if(this.administrateurRepository.findByEmail(email)!=null)
        { return new UserDetailsImpl(this.administrateurRepository.findByEmail(email));}
        else
        {
            if(this.journalisteRepository.findByEmail(email)!=null)
            { return new UserDetailsImpl(this.journalisteRepository.findByEmail(email));}
            else
            {
                if(this.redacteurEnChefRepository.findByEmail(email)!=null)
                {return new UserDetailsImpl(this.redacteurEnChefRepository.findByEmail(email));}
                else
                {
                    if(this.lecteurRepository.findByEmail(email)!=null)
                    {return new UserDetailsImpl(this.lecteurRepository.findByEmail(email));}
                    else
                    {return null;}
                }
            }
        }
    }
}
