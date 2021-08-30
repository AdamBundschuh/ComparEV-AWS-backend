package org.wcci.transportationev.project.resources;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Year {
    @Id
    @GeneratedValue
    private Long id;
    private int year;

    @ManyToMany(mappedBy = "years")
    private Collection<Make> makes;

    @OneToMany(mappedBy = "year")
    private Collection<IceVehicle> iceVehicles;

    public Year(int year) {
        this.year = year;
    }

    protected Year() {
    }

    public Long getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public Collection<Make> getMakes() {
        return makes;
    }

    public String getYearString(){
        Integer test = year;
        return test.toString();
    }
}
