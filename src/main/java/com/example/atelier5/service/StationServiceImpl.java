package com.example.atelier5.service;

import com.example.atelier5.model.Station;
import com.example.atelier5.repository.StationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceImpl implements StationService {
    private final StationRepository stationRepository;

    public StationServiceImpl(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    @Override
    public Station getStatioById(Long id) {

        Station station = stationRepository.findById(id).orElseThrow(
                () -> new RuntimeException("station not found" + id)
        );
        return station;
    }

    @Override
    public List<Station> getAllStations() {
        List<Station> stations = stationRepository.findAll();
        return stations;
    }

    @Override
    public void createStation(Station station) {
        stationRepository.save(station);
    }

    @Override
    public void updateStation(Station station) {
        stationRepository.save(station);
    }

    @Override
    public void deleteStation(Long id) {
        stationRepository.deleteById(id);
    }
}
