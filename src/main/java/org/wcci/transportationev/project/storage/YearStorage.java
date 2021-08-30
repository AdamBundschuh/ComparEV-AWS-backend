package org.wcci.transportationev.project.storage;

import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Year;

@Service
public class YearStorage {
    private YearRepository yearRepo;

    public YearStorage(YearRepository yearRepo){
        this.yearRepo = yearRepo;
    }

    public Iterable<Year> retrieveAllYears(){
        return yearRepo.findAll();
    }

    public Year retrieveYearById(Long id){
        return yearRepo.findById(id).get();
    }

    public void saveYear(Year yearToSave){
        yearRepo.save(yearToSave);
    }
    public Year retrieveMakesByYear(int year){
        return yearRepo.findByYear(year);
    }
}
