package org.wcci.transportationev.project.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GasPrice {
    @Id
    @GeneratedValue
    private Long id;
    private String state;
    private float pricePerGal;
    private int milesPer100Ice;

    public GasPrice(String state, float pricePerGal, int milesPer100Ice) {
        this.state = state;
        this.pricePerGal = pricePerGal;
        this.milesPer100Ice = milesPer100Ice;
    }

    public GasPrice() {
    }

    public Long getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public float getPricePerGal() {
        return pricePerGal;
    }

    public int getMilesPer100Ice() {
        return milesPer100Ice;
    }

    
}
