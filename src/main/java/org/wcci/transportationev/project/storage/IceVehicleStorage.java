package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.IceVehicle;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class IceVehicleStorage {

    private IceVehicleRepository iceVehicleRepo;

    public IceVehicleStorage(IceVehicleRepository iceVehicleRepo) {
        this.iceVehicleRepo = iceVehicleRepo;
    }

    public IceVehicle retrieveIceVehicleById(Long id) {
        return iceVehicleRepo.findById(id).get();
    }

    public void saveIceVehicle(IceVehicle iceVehicleToSave) {
        iceVehicleRepo.save(iceVehicleToSave);
    }

    
    
    public Collection<IceVehicle> retrieveIceVehiclesByModelId(String modelId) {

        Iterable<IceVehicle> vehicles = iceVehicleRepo.findAll();



        Collection<IceVehicle> vehiclesToReturn = new ArrayList<IceVehicle>();

        for (IceVehicle vehicle : vehicles) {



            if (vehicle.getModelId().toString().equals(modelId)) {



                vehiclesToReturn.add(vehicle);

            }

        }
        return vehiclesToReturn;
    }


}
