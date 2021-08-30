package org.wcci.transportationev.project.resources;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;

@Entity
public class Model {

    @Id
    @GeneratedValue
    private Long id;

    private String modelName;

    @ManyToOne
    @JsonIgnore
    private Make make;

    @OneToMany(mappedBy = "model")
    private Collection<IceVehicle> iceVehicles;

    //CONSTRUCTOR
    public Model(String modelName, Make make) {
        this.modelName = modelName;
        this.make = make;
    }





    //NULL CONSTRUCTOR
    protected Model() {}

    //GETTERS
    public Long getId() {return id;}
    public String getModelName() {return modelName;}
    public Make getMake() {return make;}

    public Collection<IceVehicle> getIceVehicles() {
        return iceVehicles;
    }


}
