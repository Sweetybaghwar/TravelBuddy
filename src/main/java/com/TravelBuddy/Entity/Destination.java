package com.TravelBuddy.Entity;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//
//@Entity
//public class Destination {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private Long Id;
//    private String name;
//    private String description;
//    private String imageUrl;
//
//    public Long getId() {
//        return Id;
//    }
//
//    public void setId(Long id) {
//        Id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    // No-argument constructor
//    public Destination() {
//    }
//
//
//    @Override
//    public String toString() {
//        return "Destination{" +
//                "Id=" + Id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", imageUrl='" + imageUrl + '\'' +
//                '}';
//    }
//
//    public Destination(Long id, String name, String description, String imageUrl) {
//        Id = id;
//        this.name = name;
//        this.description = description;
//        this.imageUrl = imageUrl;
//    }
//}


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "destinations")
public class Destination {

    @Id
    private String name;

    private String description;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

