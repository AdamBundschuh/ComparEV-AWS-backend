package org.wcci.transportationev.project.storage;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.ElectricVehicle;

@Service
public class ElectricVehicleStorage {

    private ElectricVehicleRepository electricVehicleRepository;

    public ElectricVehicleStorage(ElectricVehicleRepository electricVehicleRepository) {
        this.electricVehicleRepository = electricVehicleRepository;
    }

    public ElectricVehicle retrieveElectricVehicleById(Long id) {
        return electricVehicleRepository.findById(id).get();
    }

    public Iterable<ElectricVehicle> retrieveAllElectricVehicles() {
        return electricVehicleRepository.findAll();
    }

    public void saveElectricVehicle(ElectricVehicle electricVehicleToSave) {
        electricVehicleRepository.save(electricVehicleToSave);
    }

    public Collection<ElectricVehicle> retrieveEVsByPrice(int price) {

        Iterable<ElectricVehicle> evsToFilter = electricVehicleRepository.findAll();
        Collection<ElectricVehicle> filteredEVs = new ArrayList<ElectricVehicle>();

        for (ElectricVehicle ev : evsToFilter) {
            if (ev.getMsrp() <= price + 5000) {
                filteredEVs.add(ev);
            }
        }

        return filteredEVs;

    }
}
