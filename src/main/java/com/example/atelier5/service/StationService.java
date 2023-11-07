package com.example.atelier5.service;

import com.example.atelier5.model.Station;

import java.util.List;

public interface StationService {

    public Station getStatioById(Long id);

    public List<Station> getAllStations();

    public void createStation(Station station);

    public void updateStation(Station station);

    public void deleteStation(Long id);

}
