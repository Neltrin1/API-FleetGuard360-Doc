package com.fleetguard360.adminpanel.service;

import com.fleetguard360.adminpanel.model.Fleet;
import com.fleetguard360.adminpanel.repository.FleetRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FleetService {
    private final FleetRepository fleetRepository;

    public FleetService(FleetRepository fleetRepository) {
        this.fleetRepository = fleetRepository;
    }

    public Fleet save(Fleet fleet) {
        return fleetRepository.save(fleet);
    }

    public List<Fleet> getAll() {
        return fleetRepository.findAll();
    }

    public Optional<Fleet> getByPlate(String plate) {
        return fleetRepository.findByPlate(plate);
    }
}
