package com.example.atelier5.repository;

import com.example.atelier5.model.Carburant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarburantRepository extends JpaRepository<Carburant,Long> {
}
