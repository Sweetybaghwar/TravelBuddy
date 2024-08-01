package com.TravelBuddy.Service;

import com.TravelBuddy.Entity.NewsletterSignup;
import com.TravelBuddy.Repository.NewsletterSignupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class NewsletterSignupService {

    @Autowired
    private NewsletterSignupRepo newsletterSignupRepo;

    // Saving a new newsletter signup
    public NewsletterSignup saveNewsletterSignup(NewsletterSignup newsletterSignup) {
        return newsletterSignupRepo.save(newsletterSignup);
    }

    //// Getting all newsletter signups
    public List<NewsletterSignup> getAllNewsletterSignups(){
        return newsletterSignupRepo.findAll();
    }

    // Delete a newsletter signup by ID
    public void deleteNewsletterSignup(Long id) {
        newsletterSignupRepo.deleteById(id);
    }


}