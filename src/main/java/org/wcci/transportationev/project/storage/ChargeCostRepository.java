package org.wcci.transportationev.project.storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.transportationev.project.resources.ChargeCost;

public interface ChargeCostRepository extends CrudRepository<ChargeCost, Long> {
    
    ChargeCost findChargeCostByState(String stateName);
}
