package com.newsletter.controller;

import com.newsletter.model.Subscribers;
import com.newsletter.repo.SubscriberRepo;
import com.newsletter.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subscriber")
@CrossOrigin(origins = "http://localhost:5173/")
public class SubscriberController {
    @Autowired
    SubscriberRepo subscriberRepo;
    @Autowired
    SubscriberService subscriberService;

    @PostMapping("api/save")
    public ResponseEntity<Subscribers> saveSubscriber(@RequestBody Subscribers subscribers){
        Subscribers saveSubscriber = subscriberRepo.save(subscribers);
        return new ResponseEntity<>(saveSubscriber, HttpStatus.CREATED);
    }

    @GetMapping("/subscribers")
    public ResponseEntity<List<Subscribers>> getAllSubscribers(){
        return new ResponseEntity<>(subscriberService.getAllSubscribers(), HttpStatus.OK);
    }

}
