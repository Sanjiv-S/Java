public class Car extends Vehicle {
    private String fuelType;
    private String transmission;
    private int numberOfDoors;

    public String getFuelType() {
        return fuelType;
    }
    public String getTransmission() {
        return transmission;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void start(){
        System.out.print("Start with key");
    }
    public void turnoff(){
        System.out.println("Turn off the Vechile");
    }
    interface Drivable{
        void move();
        static void fuelType(){
            System.out.print("Petrol");
        }
    }
    Car(String vehicleType, String brand, String model,
        String fuelType, String transmission, int numberOfDoors) {
        super(vehicleType, brand, model);
        this.fuelType = fuelType;
        this.transmission = transmission;
        this.numberOfDoors = numberOfDoors;
    }

  

  
}
