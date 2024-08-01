package com.TravelBuddy.Controller;

import com.TravelBuddy.Entity.TravelTip;
import com.TravelBuddy.Service.TravelTipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel-tips")
public class TravelTipController {

    @Autowired
    private TravelTipService travelTipService;

    @GetMapping("/get-travel-tip")
    public List<TravelTip> getAllTravelTips(){
        return travelTipService.getAllTravelTips();
    }

    @PostMapping("/add-travel-tips")
    public TravelTip createTravelTip(@RequestBody TravelTip travelTip){
        return travelTipService.saveTravelTip(travelTip);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteTravelTip(@PathVariable Long id){
        travelTipService.deleteTravelTip(id);
    }

}