package com.newsletter.repo;

import com.newsletter.model.Subscribers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriberRepo extends JpaRepository<Subscribers, Long> {
}
