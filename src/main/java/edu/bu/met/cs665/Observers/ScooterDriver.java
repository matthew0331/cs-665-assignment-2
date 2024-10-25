package edu.bu.met.cs665.Observers;

// Concrete Observer (Scooter Driver)
public class ScooterDriver implements Driver {
    private String name;

    public ScooterDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(String deliveryRequest) {
        System.out.println(name + " received delivery request: " + deliveryRequest);
    }
}
