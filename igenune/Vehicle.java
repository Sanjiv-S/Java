abstract public class Vehicle {
    private String vehicleType;
    private String brand;
    String model;

    Vehicle(String vehicleType, String brand, String model) {
        this.vehicleType = vehicleType;
        this.brand = brand;
        this.model = model;
    }
    public String getVehicleType() {
        return vehicleType;
    }

    public String getBrand() {
        return brand;
    }
    abstract void start();
    abstract void turnoff();
   
}
