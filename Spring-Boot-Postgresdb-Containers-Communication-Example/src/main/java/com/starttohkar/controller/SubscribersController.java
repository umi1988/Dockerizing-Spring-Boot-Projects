package com.starttohkar.controller;

import com.starttohkar.entity.Subscribers;
import com.starttohkar.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subscribers")
public class SubscribersController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    //create a subscriber
    @PostMapping("/create")
    public Subscribers createSubscriber(@RequestBody Subscribers subscriber) {
        return subscriberRepository.save(subscriber);
    }

    //get all subscribers
    @GetMapping("/all")
    public Iterable<Subscribers> getAllSubscribers() {
        return subscriberRepository.findAll();
    }

    //get subscriber by id
    @GetMapping("/{id}")
    public Subscribers getSubscriberById(@PathVariable String id) {
        return subscriberRepository.findById(id).orElse(null);
    }

    //update subscriber by id
    @PutMapping("/{id}")
    public Subscribers updateSubscriberById(@PathVariable String id, @RequestBody Subscribers subscriberDetails) {
        Subscribers subscriber = subscriberRepository.findById(id).orElse(null);
        if (subscriber != null) {
            subscriber.setName(subscriberDetails.getName());
            subscriber.setEmail(subscriberDetails.getEmail());
            return subscriberRepository.save(subscriber);
        }
        return null;
    }

    //delete subscriber by id
    @DeleteMapping("/{id}")
    public void deleteSubscriberById(@PathVariable String id) {
        subscriberRepository.deleteById(id);
    }
}
