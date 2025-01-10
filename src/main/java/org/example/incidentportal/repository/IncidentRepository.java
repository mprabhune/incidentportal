package org.example.incidentportal.repository;


import org.example.incidentportal.model.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident, Long> {
    // You can define custom queries here if needed
}
