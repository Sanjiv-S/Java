public class Car extends Vehicle {
    String fuelType;
    String transmission;
    int numberOfDoors;

    Car(String vehicleType, String brand, String model,
        String fuelType, String transmission, int numberOfDoors) {
        super(vehicleType, brand, model);
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.numberOfDoors = numberOfDoors;
    }

   
    void Display() {
        super.Display();
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Transmission: " + transmission);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}
