package com.TravelBuddy.Service;

import com.TravelBuddy.Entity.TravelTip;
import com.TravelBuddy.Repository.TravelTipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelTipService {

    @Autowired
    private TravelTipRepo travelTipRepo;

    public List<TravelTip> getAllTravelTips(){
        return travelTipRepo.findAll();
    }

    public TravelTip saveTravelTip(TravelTip travelTip){
        return travelTipRepo.save(travelTip);
    }

    public void deleteTravelTip(Long id){
        if(travelTipRepo.existsById(id)){
            travelTipRepo.deleteById(id);
        }else {
            throw new RuntimeException("TravelTip with id " + id + " not found");
        }
    }

}
