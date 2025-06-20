package com.fleetguard360.adminpanel.repository;

import com.fleetguard360.adminpanel.model.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface FleetRepository extends JpaRepository<Fleet, Long> {
     Optional<Fleet> findByPlate(String plate);
}
