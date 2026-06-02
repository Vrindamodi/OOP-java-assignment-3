class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    Vehicle(String brand, String model, int year) {
        System.out.println("Vehicle constructor called");
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    protected String fuelType;

    Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        System.out.println("Car constructor called");
        this.fuelType = fuelType;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

class LuxuryCar extends Car {
    private String feature;

    LuxuryCar(String brand, String model, int year, String fuelType, String feature) {
        super(brand, model, year, fuelType);
        System.out.println("LuxuryCar constructor called");
        this.feature = feature;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Feature: " + feature);
    }
}

public class VehicleManagementSystem {
    public static void main(String[] args) {
        LuxuryCar car = new LuxuryCar("Tesla", "Model S", 2023, "Electric", "Autopilot");

        System.out.println("\nLuxury Car Details:");
        car.displayDetails();
    }
}
