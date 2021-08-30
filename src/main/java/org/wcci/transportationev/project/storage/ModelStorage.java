package org.wcci.transportationev.project.storage;
import org.springframework.stereotype.Service;
import org.wcci.transportationev.project.resources.Model;

@Service
public class ModelStorage {

    private ModelRepository modelRepo;

    public ModelStorage(ModelRepository modelRepo) {
        this.modelRepo = modelRepo;
    }

    public void saveModel(Model modelToSave) {
        modelRepo.save(modelToSave);
    }

    public Iterable<Model> retrieveAllModels() {
        return modelRepo.findAll();
    }

    public Model retrieveModelById(Long id) {
        return modelRepo.findById(id).get();
    }

}
