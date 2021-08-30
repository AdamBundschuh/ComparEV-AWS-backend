package org.wcci.transportationev.project.resources;

import java.util.Collection;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ElectricVehicle {

    @Id
    @GeneratedValue
    private Long id;
    private String authorName;
    private String makeName;
    private String modelName;
    private String vehicleType;
    private int msrp;
    private boolean taxCredit;
    private double yearlyMaintenanceCost;
    private int range;
    private int mpgE;
    private double zeroToSixty;
    private int topSpeed;
    private String wheelDrive;
    private double homeCharge;
    private int travelCharge;
    private int seating;
    private boolean autonomous;
    private boolean driverAssist;
    private boolean freeOtaUpdate;
    private double rearCargoSpace;
    private double frunkSpace;
    private double safetyRating;
    private boolean phoneKey;
    @Lob
    private String imageUrl;
    @Lob
    private String imageUrl2;

    @Lob
    private String reviewContent;

    @Lob
    @ElementCollection
    private Collection<String> reviewComments;

    protected ElectricVehicle() {

    }

    public ElectricVehicle(String makeName, String modelName, String authorName, String vehicleType,
                            int msrp, boolean taxCredit, double yearlyMaintenanceCost,
                           int range, int mpgE, double zeroToSixty, int topSpeed, String wheelDrive,
                           double homeCharge, int travelCharge, int seating, boolean autonomous,
                           boolean driverAssist, boolean freeOtaUpdate, double rearCargoSpace,
                            double frunkSpace, double safetyRating, boolean phoneKey, String imageUrl,
                            String imageUrl2, String reviewContent, String... reviewComments) {
        this.makeName = makeName;
        this.modelName = modelName;
        this.authorName = authorName;
        this.vehicleType = vehicleType;
        this.msrp = msrp;
        this.yearlyMaintenanceCost = yearlyMaintenanceCost;
        this.taxCredit = taxCredit;
        this.range = range;
        this.mpgE = mpgE;
        this.zeroToSixty = zeroToSixty;
        this.topSpeed = topSpeed;
        this.wheelDrive = wheelDrive;
        this.homeCharge = homeCharge;
        this.travelCharge = travelCharge;
        this.seating = seating;
        this.autonomous = autonomous;
        this.driverAssist = driverAssist;
        this.freeOtaUpdate = freeOtaUpdate;
        this.rearCargoSpace = rearCargoSpace;
        this.frunkSpace = frunkSpace;
        this.safetyRating = safetyRating;
        this.phoneKey = phoneKey;
        this.imageUrl = imageUrl;
        this.imageUrl2 = imageUrl2;
        this.reviewContent = reviewContent;
        this.reviewComments = Set.of(reviewComments);
    }

    public Long getId() {
        return id;
    }

    public String getMakeName() {
        return makeName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getMsrp() {
        return msrp;
    }

    public boolean isTaxCredit() {
        return taxCredit;
    }

    public double getYearlyMaintenanceCost() {
        return yearlyMaintenanceCost;
    }

    public int getRange() {
        return range;
    }

    public int getMpgE() {
        return mpgE;
    }

    public double getZeroToSixty() {
        return zeroToSixty;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getWheelDrive() {
        return wheelDrive;
    }

    public double getHomeCharge() {
        return homeCharge;
    }

    public int getTravelCharge() {
        return travelCharge;
    }

    public int getSeating() {
        return seating;
    }

    public boolean isAutonomous() {
        return autonomous;
    }

    public boolean isDriverAssist() {
        return driverAssist;
    }

    public boolean isFreeOtaUpdate() {
        return freeOtaUpdate;
    }

    public double getRearCargoSpace() {
        return rearCargoSpace;
    }

    public double getFrunkSpace() {
        return frunkSpace;
    }

    public double getSafetyRating() {
        return safetyRating;
    }

    public boolean isPhoneKey() {
        return phoneKey;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageUrl2() {
        return imageUrl2;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public Iterable<String> getReviewComments() {
        return reviewComments;
    }

    public void addElectricVehicleComment(String newReviewComment) {
        this.reviewComments.add(newReviewComment);
    }
}
