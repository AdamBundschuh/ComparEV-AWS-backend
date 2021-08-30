package org.wcci.transportationev.project.resources;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class IceVehicle {
    @Id
    @GeneratedValue
    private Long id;
    private int mpg;
    private int range;
    private int msrp;
    private float yearlyMaintCost;
    private float zeroToSixty;
    private int topSpeed;
    private String imageUrl;

    @ManyToOne
    @JsonIgnore
    private Model model;

    @ManyToOne
    @JsonIgnore
    private Year year;
    
    @ManyToOne
    @JsonIgnore
    private Make make;


    public IceVehicle(int mpg, int range, int msrp, float yearlyMaintCost,
                      float zeroToSixty, int topSpeed, Year year, Make make, Model model,String imageUrl) {
        this.mpg = mpg;
        this.range = range;
        this.msrp = msrp;
        this.yearlyMaintCost = yearlyMaintCost;
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
        this.year = year;
        this.make = make;
        this.model = model;
        this.imageUrl = imageUrl;
    }

    public IceVehicle() {
    }

    public Long getId() {
        return id;
    }

    public int getMpg() {
        return mpg;
    }

    public int getRange() {
        return range;
    }

    public int getMsrp() {
        return msrp;
    }

    public float getYearlyMaintCost() {
        return yearlyMaintCost;
    }

    public float getZeroToSixty() {
        return zeroToSixty;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getModelName() {
        return model.getModelName();
    }

    public Long getModelId(){
        return model.getId();
    }

    public Long getYearId(){
        return year.getId();
    }

    public Long getMakeId(){
        return make.getId();
    }

    public int getYear() {
        return year.getYear();
    }

    public String getMakeName() {
        return make.getMakeName();
    }
    public String getYearString(){
        return year.getYearString();
    }

    public Model getModel() {
        return model;
    }

    public Make getMake() {
        return make;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
