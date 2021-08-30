package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ChargeCost {

    @Id
    @GeneratedValue
    private Long id;
    private String state;
    private double costPerHomeCharge;
    private int milesPer100Home;
    private double costPerTravelCharge;
    private int milesPer100Travel;
    

    public ChargeCost(String state, double costPerHomeCharge, int milesPer100Home, double costPerTravelCharge,
            int milesPer100Travel) {
        this.state = state;
        this.costPerHomeCharge = costPerHomeCharge;
        this.milesPer100Home = milesPer100Home;
        this.costPerTravelCharge = costPerTravelCharge;
        this.milesPer100Travel = milesPer100Travel;
    }
    
    public ChargeCost() {
    }

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public double getCostPerHomeCharge() {
        return costPerHomeCharge;
    }

    public int getMilesPer100Home() {
        return milesPer100Home;
    }

    public double getCostPerTravelCharge() {
        return costPerTravelCharge;
    }

    public int getMilesPer100Travel() {
        return milesPer100Travel;
    }

}
