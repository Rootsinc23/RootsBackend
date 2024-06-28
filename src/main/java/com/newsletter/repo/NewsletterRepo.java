package com.newsletter.repo;

import com.newsletter.model.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterRepo extends JpaRepository<Newsletter, Long> {
}

