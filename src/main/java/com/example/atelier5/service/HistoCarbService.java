package com.example.atelier5.service;

import com.example.atelier5.model.HistoCarb;

import java.util.List;

public interface HistoCarbService {

    public HistoCarb getHistoCarbById(Long id);

    public List<HistoCarb> getAllHistoCarbs();

    public void createHistoCarb(HistoCarb histoCarb);

    public void updateHistoCarb(HistoCarb histoCarb);

    public void deleteHistoCarb(Long id);
}
