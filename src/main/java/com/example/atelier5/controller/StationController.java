package com.example.atelier5.controller;


import com.example.atelier5.model.Station;
import com.example.atelier5.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {

    @Autowired
    StationService stationService;

    @GetMapping("/{id}")
    public Station getStationById(@PathVariable Long id){
        Station station = stationService.getStatioById(id);
        return station;
    }

    @GetMapping("/")
    public List<Station> getAllStations(){
        List<Station> stations = stationService.getAllStations();
        return stations;
    }

    @PostMapping("/")
    public String createStation(@RequestBody Station station){
        stationService.createStation(station);
        return "The station has been created";
    }

    @PutMapping("/")
    public String updateStation(@RequestBody Station station){
        stationService.updateStation(station);
        return "the staion has been updated";
    }

    @DeleteMapping("/{id}")
    public String deleteStation(@PathVariable Long id){
        stationService.deleteStation(id);
        return "the station has been deleted";
    }
}
