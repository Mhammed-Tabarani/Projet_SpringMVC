package com.emsi.morocco24.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.emsi.morocco24.entity.Commentaire;
import com.emsi.morocco24.service.ArticleService;
import com.emsi.morocco24.service.LecteurService;



@Controller
@RequestMapping("/lecteurs")
public class LecteurController {

    @Autowired
    LecteurService lecteurService;
    @Autowired
    ArticleService articleService;


    @PostMapping("/articles/add-comment/{articlePublicId}")
    public String addCommentToAricleAricle(@ModelAttribute Commentaire commentaire, @PathVariable String articlePublicId)
    {
        articleService.addCommentToAricleAricle(commentaire,articlePublicId);
        return "redirect:/article-details/"+articlePublicId;
    }

    @GetMapping("/follow-journalist/{articlePublicId}")
    public String followJournalist(@PathVariable String articlePublicId)
    {
        lecteurService.followJournalist(articlePublicId);
        return "redirect:/article-details/"+articlePublicId;
    }
    @Transactional
    @GetMapping("/unfollow-journalist/{articlePublicId}")
    public String unfollowJournalist(@PathVariable String articlePublicId)
    {
        lecteurService.unfollowJournalist(articlePublicId);
        return "redirect:/article-details/"+articlePublicId;
    }


}
