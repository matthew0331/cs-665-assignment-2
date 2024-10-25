package edu.bu.met.cs665;

import edu.bu.met.cs665.ShopSystem.DeliveryRequest;
import edu.bu.met.cs665.ShopSystem.Shop;
import edu.bu.met.cs665.Observers.VanDriver;
import edu.bu.met.cs665.Observers.TaxiDriver;
import edu.bu.met.cs665.Observers.ScooterDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class DeliverySystemTests {

    private Shop shop;
    private VanDriver vanDriver;
    private TaxiDriver taxiDriver;
    private ScooterDriver scooterDriver;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        // Redirect system output to capture printed messages
        System.setOut(new PrintStream(outContent));

        // Initialize the shop and drivers
        shop = new Shop();
        vanDriver = new VanDriver("Van Driver 1");
        taxiDriver = new TaxiDriver("Taxi Driver 1");
        scooterDriver = new ScooterDriver("Scooter Driver 1");

        shop.addDriver(vanDriver);
        shop.addDriver(taxiDriver);
        shop.addDriver(scooterDriver);
    }

    @Test
    public void testDeliveryRequestNotification() {
        // Broadcast a new delivery request
        DeliveryRequest request = new DeliveryRequest("123 Main St.", "Electronics");
        shop.newDeliveryRequest(request);

        // Validate that all drivers received the notification
        String expectedOutput = "Shop: New delivery request received: Package to be delivered to 123 Main St. containing: Electronics\n"
                + "Van Driver 1 received delivery request: Package to be delivered to 123 Main St. containing: Electronics\n"
                + "Taxi Driver 1 received delivery request: Package to be delivered to 123 Main St. containing: Electronics\n"
                + "Scooter Driver 1 received delivery request: Package to be delivered to 123 Main St. containing: Electronics\n";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    public void testRemovingDriver() {
        // Remove the taxi driver and broadcast another request
        shop.removeDriver(taxiDriver);
        DeliveryRequest request = new DeliveryRequest("456 Market St.", "Food");
        shop.newDeliveryRequest(request);

        // Validate that only van and scooter drivers received the notification
        String expectedOutput = "Shop: New delivery request received: Package to be delivered to 456 Market St. containing: Food\n"
                + "Van Driver 1 received delivery request: Package to be delivered to 456 Market St. containing: Food\n"
                + "Scooter Driver 1 received delivery request: Package to be delivered to 456 Market St. containing: Food\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}
