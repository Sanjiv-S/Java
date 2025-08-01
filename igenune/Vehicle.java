public class Vehicle {
    String vehicleType;
    String brand;
    String model;

    Vehicle(String vehicleType, String brand, String model) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
    }

    void Display() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Brand Name: " + brand);
        System.out.println("Model Name: " + model);
    }
}
