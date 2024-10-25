package edu.bu.met.cs665.ShopSystem;

import edu.bu.met.cs665.Observers.Driver;
import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
public class Shop {
    private List<Driver> drivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        drivers.remove(driver);
    }

    public void notifyDrivers(DeliveryRequest deliveryRequest) {
        for (Driver driver : drivers) {
            driver.update(deliveryRequest.toString());
        }
    }

    public void newDeliveryRequest(DeliveryRequest deliveryRequest) {
        System.out.println("Shop: New delivery request received: " + deliveryRequest.toString());
        notifyDrivers(deliveryRequest);
    }
}
