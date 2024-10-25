package edu.bu.met.cs665.ShopSystem;

import edu.bu.met.cs665.Observers.Driver;
import edu.bu.met.cs665.Observers.VanDriver;
import edu.bu.met.cs665.Observers.TaxiDriver;
import edu.bu.met.cs665.Observers.ScooterDriver;

public class Main {
    public static void main(String[] args) {
        // Create a shop (subject)
        Shop shop = new Shop();

        // Create and register drivers (observers)
        Driver vanDriver = new VanDriver("Van Driver 1");
        Driver taxiDriver = new TaxiDriver("Taxi Driver 1");
        Driver scooterDriver = new ScooterDriver("Scooter Driver 1");

        shop.addDriver(vanDriver);
        shop.addDriver(taxiDriver);
        shop.addDriver(scooterDriver);

        // Shop issues a new delivery request
        DeliveryRequest request1 = new DeliveryRequest("123 Main St.", "Electronics");
        shop.newDeliveryRequest(request1);

        // Removing a driver and issuing another request
        shop.removeDriver(taxiDriver);
        DeliveryRequest request2 = new DeliveryRequest("456 Market St.", "Food");
        shop.newDeliveryRequest(request2);
    }
}
