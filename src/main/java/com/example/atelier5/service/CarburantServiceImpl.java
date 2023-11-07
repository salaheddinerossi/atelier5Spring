package com.example.atelier5.service;

import com.example.atelier5.model.Carburant;
import com.example.atelier5.repository.CarburantRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;

@Service
public class CarburantServiceImpl implements CarburantService{

    private final CarburantRepository carburantRepository;

    public CarburantServiceImpl(CarburantRepository carburantRepository) {
        this.carburantRepository = carburantRepository;
    }

    @Override
    public Carburant getCarburantById(Long id) {

        Carburant carburant = carburantRepository.findById(id).
                orElseThrow(
                        () -> new RuntimeException("station not found" + id)
                );
        return carburant;

    }

    @Override
    public List<Carburant> getAllCarburants() {
        List<Carburant> carburants = carburantRepository.findAll();
        return carburants;
    }

    @Override
    public void createCarburant(Carburant carburant) {
        carburantRepository.save(carburant);
    }

    @Override
    public void updateCarburant(Carburant carburant, Long id) {
        Carburant carburant1 = this.getCarburantById(id);
        carburant1.setDescription(carburant.getDescription());
        carburant1.setNom(carburant.getNom());
        carburantRepository.save(carburant1);
    }

    @Override
    public void deleteCarburant(Long id) {
        carburantRepository.deleteById(id);
    }
}
