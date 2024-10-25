package edu.bu.met.cs665.Observers;

// Concrete Observer (Van Driver)
public class VanDriver implements Driver {
    private String name;

    public VanDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(String deliveryRequest) {
        System.out.println(name + " received delivery request: " + deliveryRequest);
    }
}
