package com.TravelBuddy.Controller;

//import com.TravelBuddy.Entity.Destination;
//import com.TravelBuddy.Service.DestinationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Arrays;
//import java.util.List;
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping("/api/destinations")
//public class DestinationController {
//
//
//    @Autowired
//    private DestinationService destinationService;
//
//    @GetMapping("/getDestination")
//    public List<Destination> getAllDestinations() {
//        return destinationService.getAllDestinations();
//    }
//
//    @PostMapping("/addDestination")
//    public Destination createDestination(@RequestBody Destination destination) {
//        return destinationService.saveDestination(destination);
//    }
//
//    @DeleteMapping("/deleteDestination/{id}")
//    public void deleteDestination(@PathVariable Long id) {
//        destinationService.deleteDestination(id);
//    }
//}

import com.TravelBuddy.Entity.Destination;
import com.TravelBuddy.Service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/destinations")
public class DestinationController {



    @Autowired
    private DestinationService destinationService;

//    @PostMapping("/create-table")
//    public String createTable() {
//        return destinationService.createTable();
//    }

    @PostMapping("/add")
    public Destination addDestination(@RequestBody Destination destination) {
        return destinationService.addDestination(destination);
    }

    @GetMapping("/{name}")
    public Optional<Destination> getDestination(@PathVariable String name) {
        return destinationService.getDestination(name);
    }
}



