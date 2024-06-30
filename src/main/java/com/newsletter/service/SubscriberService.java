package com.newsletter.service;

import com.newsletter.model.Subscribers;
import com.newsletter.repo.SubscriberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberService {
    @Autowired
    SubscriberRepo subscriberRepo;

    public Subscribers saveSubscriber(Subscribers subscribers){
        return subscriberRepo.save(subscribers);
    }
    public List<Subscribers> getAllSubscribers(){
        return subscriberRepo.findAll();
    }
}

