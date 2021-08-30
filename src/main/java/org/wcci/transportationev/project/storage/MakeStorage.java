package org.wcci.transportationev.project.storage;
import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Year;

@Service
public class MakeStorage {

    private MakeRepository makeRepo;

    public MakeStorage(MakeRepository makeRepo) {
        this.makeRepo = makeRepo;
    }

    public Iterable<Make> retrieveAllMakes() {
        return makeRepo.findAll();
    }

    public Make retrieveMakeById(Long id) {
        return makeRepo.findById(id).get();
    }

    public void saveMake(Make makeToSave) {
        makeRepo.save(makeToSave);
    }
}
