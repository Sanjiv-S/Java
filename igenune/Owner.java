public class Owner extends Car {
    String ownerName;
    String contactNumber;
    String licenseNumber;

    Owner(String vehicleType, String brand, String model,
          String fuelType, String transmission, int numberOfDoors,
          String ownerName, String contactNumber, String licenseNumber) {
        super(vehicleType, brand, model, fuelType, transmission, numberOfDoors);
        this.ownerName = ownerName;
        this.contactNumber = contactNumber;
        this.licenseNumber = licenseNumber;
    }

   
    void Display() {
        super.Display();
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("License Number: " + licenseNumber);
    }
}
