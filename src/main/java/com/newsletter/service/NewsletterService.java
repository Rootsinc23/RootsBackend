package com.newsletter.service;

import com.newsletter.model.Newsletter;
import com.newsletter.repo.NewsletterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsletterService {
    @Autowired
    NewsletterRepo newsletterRepo;

    public List<Newsletter> getAllNewsLetter(){
        return newsletterRepo.findAll();
    }
    public Newsletter saveNewsletter(Newsletter newsletter){return newsletterRepo.save(newsletter);}
}
