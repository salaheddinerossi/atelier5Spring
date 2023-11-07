package com.example.atelier5.model;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "histocarb")
public class HistoCarb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;

    private Double prix;

    @ManyToOne
    @JoinColumn(name = "station_id")
    @JsonIgnoreProperties("histoCarbs")
    private Station station;

    @ManyToOne
    @JoinColumn(name = "carburant_id")
    @JsonIgnoreProperties("histoCarbs")
    private Carburant carburant;


}
