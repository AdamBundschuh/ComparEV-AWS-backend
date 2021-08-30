package org.wcci.transportationev.project.storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.transportationev.project.resources.ElectricVehicle;

public interface ElectricVehicleRepository  extends CrudRepository<ElectricVehicle, Long> {

}
