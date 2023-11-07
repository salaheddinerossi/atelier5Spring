package com.example.atelier5.controller;


import com.example.atelier5.dto.HistoCarbDTO;
import com.example.atelier5.model.Carburant;
import com.example.atelier5.model.HistoCarb;
import com.example.atelier5.model.Station;
import com.example.atelier5.service.CarburantService;
import com.example.atelier5.service.HistoCarbService;
import com.example.atelier5.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/histocarb")
public class HistoCarbController {

    @Autowired
    CarburantService carburantService;

    @Autowired
    HistoCarbService histoCarbService;

    @Autowired
    StationService stationService;

    @GetMapping("/{id}")
    public HistoCarb getHistoCarbById(@PathVariable Long id){
        HistoCarb histoCarb = histoCarbService.getHistoCarbById(id);
        return histoCarb;
    }

    @GetMapping("/")
    public List<HistoCarb> getAllHistoCarbs(){
        List<HistoCarb> histoCarbs = histoCarbService.getAllHistoCarbs();
        return histoCarbs;
    }

    @PostMapping("/")
    public String createHistoCarb(@RequestBody  HistoCarbDTO histoCarbDTO){

        Carburant carburant = carburantService.getCarburantById(histoCarbDTO.getCarburantId());
        Station station = stationService.getStatioById(histoCarbDTO.getStationId());
        System.out.println(histoCarbDTO);

        HistoCarb histoCarb = new HistoCarb();
        histoCarb.setPrix(histoCarbDTO.getPrix());
        histoCarb.setDate(histoCarbDTO.getDate());
        histoCarb.setCarburant(carburant);
        histoCarb.setStation(station);

        histoCarbService.createHistoCarb(histoCarb);

        return "the histoCarb has been crated";
    }

    @PutMapping("/")
    public String updateHistCarb(@RequestBody HistoCarbDTO histoCarbDTO){


        Carburant carburant = carburantService.getCarburantById(histoCarbDTO.getCarburantId());
        Station station = stationService.getStatioById(histoCarbDTO.getStationId());
        System.out.println(histoCarbDTO);

        HistoCarb histoCarb = new HistoCarb();
        histoCarb.setId(histoCarbDTO.getId());
        histoCarb.setPrix(histoCarbDTO.getPrix());
        histoCarb.setDate(histoCarbDTO.getDate());
        histoCarb.setCarburant(carburant);
        histoCarb.setStation(station);

        histoCarbService.updateHistoCarb(histoCarb);

        return "the histoCarb has been updated";

    }

    @DeleteMapping("/{id}")
    public String deleteHistoCarb(@PathVariable Long id){
        histoCarbService.deleteHistoCarb(id);
        return "this HistoCarb has been deleted!";
    }



}
