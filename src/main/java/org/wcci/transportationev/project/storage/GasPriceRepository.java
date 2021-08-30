package org.wcci.transportationev.project.storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.transportationev.project.resources.GasPrice;

public interface GasPriceRepository extends CrudRepository<GasPrice, Long> {

    
}
