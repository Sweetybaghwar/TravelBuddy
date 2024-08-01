package com.TravelBuddy.Controller;

import com.TravelBuddy.Entity.NewsletterSignup;
import com.TravelBuddy.Repository.NewsletterSignupRepo;
import com.TravelBuddy.Service.NewsletterSignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/newsletter")
public class NewsletterSignupController {

    @Autowired
    private NewsletterSignupService newsletterSignupService;

    @PostMapping("/add")
    public NewsletterSignup subscribe(@RequestBody NewsletterSignup newsletterSignup){
        return newsletterSignupService.saveNewsletterSignup(newsletterSignup);
    }

    @DeleteMapping("/delete-newsletter/{id}")
    public void deleteNewsletterSignup(@PathVariable Long id){
        newsletterSignupService.deleteNewsletterSignup(id);
    }
}
