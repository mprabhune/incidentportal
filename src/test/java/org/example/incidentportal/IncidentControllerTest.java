package org.example.incidentportal;

import org.example.incidentportal.model.Incident;
import org.example.incidentportal.repository.IncidentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;
import org.example.incidentportal.controller.IncidentController;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class IncidentControllerTest {
//
//    @InjectMocks
//    private IncidentController incidentController;  // The controller to test
//
//    @Mock
//    private IncidentRepository incidentRepository;  // Mocking the repository
//
//    @Mock
//    private Model model;  // Mocking the Model to pass data to the view
//
//    private List<Incident> mockIncidents;  // Dummy data for testing
//
//    @BeforeEach
//    void setUp() {
//        // Initialize mocks and setup dummy incidents
//        MockitoAnnotations.openMocks(this);
//        mockIncidents = Arrays.asList(
//                new Incident("INC001", "John Doe", "Resolved", "No action required", "Remarks 1", "John Doe"),
//                new Incident("INC002", "Jane Doe", "In Progress", "Action required", "Remarks 2", "Jane Doe")
//        );
//    }
//
//    @Test
//    void testShowIncidentList() {
//        // Arrange: Mock the repository call to return the dummy incidents
//        when(incidentRepository.findAll()).thenReturn(mockIncidents);
//
//        // Act: Call the controller method
//        String viewName = incidentController.listIncidents(model);
//
//        // Assert: Check if the model is populated and the correct view is returned
//        assertNotNull(viewName);  // Check that the view name is returned
//        assertEquals("index", viewName);  // The expected Thymeleaf template name
//
//        // Verify that the incidents list is added to the model
//        verify(model).addAttribute("incidents", mockIncidents);
//
//        // Assert that the incident list is not empty
//        assertFalse(mockIncidents.isEmpty(), "Incident list should not be empty");
//        assertEquals(2, mockIncidents.size(), "There should be 2 incidents");
//    }
}
