package domain;

import enums.VehicleCategory;

import java.math.BigDecimal;
import java.util.UUID;

public class Vehicle {
    private UUID id;
    private String model;
    private String version;
    private BigDecimal price;
    private VehicleCategory category;
    private boolean active;

    public Vehicle(UUID id, String model, String version, BigDecimal price, VehicleCategory category, boolean active) {
        this.id = id;
        this.model = model;
        this.version = version;
        this.price = price;
        this.category = category;
        this.active = active;
    }

    public UUID getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getVersion() {
        return version;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public VehicleCategory getCategory() {
        return category;
    }

    public boolean isActive() {
        return active;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCategory(VehicleCategory category) {
        this.category = category;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}