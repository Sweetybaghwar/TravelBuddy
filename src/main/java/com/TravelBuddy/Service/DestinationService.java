package com.TravelBuddy.Service;

import com.TravelBuddy.Entity.Destination;
import com.TravelBuddy.Repository.DestinationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.util.Optional;


//import com.TravelBuddy.Entity.Destination;
//import com.TravelBuddy.Repository.DestinationRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DestinationService {
//
//    @Autowired
//    private DestinationRepo destinationRepo;
//
//    public List<Destination> getAllDestinations(){
//        return destinationRepo.findAll();
//    }
//
//    public Destination saveDestination(Destination destination){
//        return destinationRepo.save(destination);
//    }
//
//    public void deleteDestination(Long id){
//        if(destinationRepo.existsById(id)){
//           destinationRepo.deleteById(id);
//        }
//    }
//
@Service
public class DestinationService {


    @Autowired
    private DestinationRepo destinationRepo;

//    public String createTable() {
//        String sql = "CREATE TABLE IF NOT EXISTS destinations (" +
//                "name VARCHAR(255) PRIMARY KEY, " +
//                "description TEXT)";
//        try (Connection connection = dataSource.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.execute(sql);
//            return "Table created successfully";
//        } catch (SQLException e) {
//            e.printStackTrace();
//            return "Error creating table: " + e.getMessage();
//        }
//    }

    public Destination addDestination(Destination destination) {
        return destinationRepo.save(destination);
    }

    public Optional<Destination> getDestination(String name) {
        return destinationRepo.findById(name);
    }
}
