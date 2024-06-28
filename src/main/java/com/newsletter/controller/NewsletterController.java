package com.newsletter.controller;

import com.newsletter.model.Newsletter;
import com.newsletter.repo.NewsletterRepo;
import com.newsletter.service.NewsletterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/newsletter")
@CrossOrigin(origins = "http://localhost:5173")
public class NewsletterController {
    @Autowired
    NewsletterService newsletterService;
    @Autowired
    private NewsletterRepo newsletterRepo;

    @PostMapping("/save")
    public ResponseEntity<Newsletter> saveNewsletter(@RequestBody Newsletter newsletter){
        Newsletter savedNewsletter = newsletterRepo.save(newsletter);
        return new ResponseEntity<>(savedNewsletter, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public List<Newsletter> getAllNewsletter(){
        return newsletterService.getAllNewsLetter();
    }
}
