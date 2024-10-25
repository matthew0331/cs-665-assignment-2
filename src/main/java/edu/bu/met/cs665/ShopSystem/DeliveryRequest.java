package edu.bu.met.cs665.ShopSystem;

// Class representing a Delivery Request
public class DeliveryRequest {
    private String destination;
    private String packageDetails;

    public DeliveryRequest(String destination, String packageDetails) {
        this.destination = destination;
        this.packageDetails = packageDetails;
    }

    public String getDestination() {
        return destination;
    }

    public String getPackageDetails() {
        return packageDetails;
    }

    @Override
    public String toString() {
        return "Package to be delivered to " + destination + " containing: " + packageDetails;
    }
}
