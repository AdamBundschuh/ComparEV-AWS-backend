package org.wcci.transportationev.project.resources;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collection;
import java.util.Set;

@Entity
public class Make {

    @Id
    @GeneratedValue
    private Long id;
    private String makeName;

    @OneToMany(mappedBy = "make")
    private Collection<Model> models;

    @ManyToMany
    @JsonIgnore
    private Collection<Year> years;

    @OneToMany(mappedBy = "make")
    private Collection<IceVehicle> iceVehicles;

    //CONSTRUCTOR
    public Make(String makeName, Year... years) {
        this.makeName = makeName;
        this.years = Set.of(years);
    }




    //NULL CONSTRUCTOR
    protected Make() {
    }

    //GETTERS
    public Long getId() {
        return id;
    }

    public String getMakeName() {
        return makeName;
    }

    public Collection<Model> getModels() {
        return models;
    }

    public Collection<Year> getYears() {
        return years;
    }

    public Collection<IceVehicle> getIceVehicles() {
        return iceVehicles;
    }
}
