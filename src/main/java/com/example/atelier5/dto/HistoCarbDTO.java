package com.example.atelier5.dto;

import lombok.Data;

import java.time.LocalDate;


@Data
public class HistoCarbDTO {
    private Long id;
    private Long carburantId;
    private Long stationId;
    private Double prix;
    private LocalDate date;

}
