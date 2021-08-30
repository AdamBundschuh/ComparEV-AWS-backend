package org.wcci.transportationev.project.storage;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Year;

public interface YearRepository extends CrudRepository<Year, Long> {
    Year findByYear(int year);
}
