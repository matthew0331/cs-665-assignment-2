package edu.bu.met.cs665.Observers;

// Concrete Observer (Taxi Driver)
public class TaxiDriver implements Driver {
    private String name;

    public TaxiDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(String deliveryRequest) {
        System.out.println(name + " received delivery request: " + deliveryRequest);
    }
}
