package org.example.incidentportal.controller;


import org.example.incidentportal.model.Incident;
import org.example.incidentportal.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IncidentController {

    @Autowired
    private IncidentRepository incidentRepository;

    // Show form to create a new incident
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("incident", new Incident());
        return "index";  // The HTML page that will be rendered
    }

    // Submit new incident form
    @PostMapping("/incident")
    public String createIncident(@ModelAttribute Incident incident, Model model) {
        incidentRepository.save(incident);
        model.addAttribute("message", "Incident saved successfully!");
        return "index";
    }

    // List all incidents
    @GetMapping("/incidents")
    public String listIncidents(Model model) {
        List<Incident> incidents = incidentRepository.findAll();
        model.addAttribute("incidents", incidents);
        return "incidentList";
    }
}
