package com.example.atelier5.service;

import com.example.atelier5.model.Carburant;

import java.util.List;

public interface CarburantService {

    public Carburant getCarburantById(Long id);

    public List<Carburant> getAllCarburants();

    public void createCarburant(Carburant carburant);

    public void updateCarburant(Carburant carburant,Long id);

    public void deleteCarburant(Long id);

}
