import domain.Vehicle;
import enums.VehicleCategory;

import java.math.BigDecimal;
import java.util.UUID;

public class Main {
    static void main() {
        Vehicle vehicle = new Vehicle(
          UUID.randomUUID(),
          "R1",
          "Perfomance",
          new BigDecimal("250000.00"),
                VehicleCategory.SUPERSPORT,
                  true
        );

        System.out.println("ID: " + vehicle.getId());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Version: " + vehicle.getVersion());
        System.out.println("Price: " + vehicle.getPrice());
        System.out.println("Category: " + vehicle.getCategory());
        System.out.println("Active: " + vehicle.isActive());
    }
}