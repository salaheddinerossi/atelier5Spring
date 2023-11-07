package com.example.atelier5.controller;


import com.example.atelier5.model.Carburant;
import com.example.atelier5.service.CarburantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carburant")
public class CarburantController {

    @Autowired
    CarburantService carburantService;

    @GetMapping("/{id}")
    public Carburant getCarburantById(@PathVariable Long id){
        Carburant carburant = carburantService.getCarburantById(id);
        return carburant;
    }

    @GetMapping("/")
    public List<Carburant> getAllCarburants(){
        List<Carburant> carburants = carburantService.getAllCarburants();
        return carburants;
    }

    @PostMapping("/")
    public String createCarburant(@RequestBody Carburant carburant){
        carburantService.createCarburant(carburant);
        return "the carburant has been created!";
    }

    @PutMapping("/")
    public String updateCarburant(@RequestBody Carburant carburant){
        carburantService.updateCarburant(carburant,carburant.getId());
        return "the carburant has been updated!";
    }

    @DeleteMapping("/{id}")
    public String deleteCarburant(@PathVariable Long id){
        carburantService.deleteCarburant(id);
        return "the carburant has been deleted!";
    }

}
