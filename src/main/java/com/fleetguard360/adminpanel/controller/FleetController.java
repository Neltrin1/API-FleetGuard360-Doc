package com.fleetguard360.adminpanel.controller;

import com.fleetguard360.adminpanel.model.Fleet;
import com.fleetguard360.adminpanel.repository.FleetRepository;
import com.fleetguard360.adminpanel.service.FleetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fleets")
@CrossOrigin(origins = "*")
public class FleetController {

    @Autowired
    private FleetService fleetService;

    @PostMapping
    public ResponseEntity<Fleet> createFleet(@RequestBody Fleet fleet) {
        Fleet savedFleet = fleetService.save(fleet);
        return ResponseEntity.ok(savedFleet);
    }

    @GetMapping
    public ResponseEntity<List<Fleet>> getAllFleets() {
        return ResponseEntity.ok(fleetService.getAll());
    }

    // Obtener una flota por su placa
    @GetMapping("/{plate}")
    public ResponseEntity<Fleet> getFleetByPlate(@PathVariable String plate) {
        return fleetService.getByPlate(plate)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
