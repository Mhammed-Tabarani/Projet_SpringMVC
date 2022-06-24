package com.emsi.morocco24.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.emsi.morocco24.entity.UserDetailsImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class LoginSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws ServletException, IOException {

        UserDetailsImpl userDetails =   (UserDetailsImpl) authentication.getPrincipal();

        String redirectURL = request.getContextPath();

        if (userDetails.getRole()==("ROLE_ADMINISTRATEUR"))
        { redirectURL = "/admins";}
        else
        {
            if(userDetails.getRole()==("ROLE_LECTEUR"))
            {
                redirectURL = "/";
            }
            else
            {
                if(userDetails.getRole()==("ROLE_JOURNALISTE"))
                {
                    redirectURL = "/journalistes";
                }
                else
                {
                    redirectURL = "/chefs";
                }
            }
        }
        response.sendRedirect(redirectURL);
    }

}
