package com.TravelBuddy.Repository;
//
//import com.TravelBuddy.Entity.Destination;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface DestinationRepo extends JpaRepository<Destination, Long> {
//}

import com.TravelBuddy.Entity.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepo extends JpaRepository<Destination, String> {
}