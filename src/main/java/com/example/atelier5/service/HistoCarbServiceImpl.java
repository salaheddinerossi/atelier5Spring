package com.example.atelier5.service;

import com.example.atelier5.model.HistoCarb;
import com.example.atelier5.repository.HistoCarbRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoCarbServiceImpl implements HistoCarbService {
    private final HistoCarbRepository histoCarbRepository;

    public HistoCarbServiceImpl(HistoCarbRepository histoCarbRepository) {
        this.histoCarbRepository = histoCarbRepository;
    }

    @Override
    public HistoCarb getHistoCarbById(Long id) {
        HistoCarb histoCarb = histoCarbRepository.findById(id).orElseThrow(
                () -> new RuntimeException("histoCarb not found " +id)
        );
        return histoCarb;
    }

    @Override
    public List<HistoCarb> getAllHistoCarbs() {
        List<HistoCarb> histoCarbs = histoCarbRepository.findAll();
        return histoCarbs;
    }

    @Override
    public void createHistoCarb(HistoCarb histoCarb) {
        histoCarbRepository.save(histoCarb);
    }

    @Override
    public void updateHistoCarb(HistoCarb histoCarb) {
        histoCarbRepository.save(histoCarb);
    }

    @Override
    public void deleteHistoCarb(Long id) {
        histoCarbRepository.deleteById(id);
    }
}
