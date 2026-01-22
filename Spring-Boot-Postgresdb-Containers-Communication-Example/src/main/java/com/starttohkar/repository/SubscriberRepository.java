package com.starttohkar.repository;

import com.starttohkar.entity.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepository extends JpaRepository<Subscribers, String> {
}
