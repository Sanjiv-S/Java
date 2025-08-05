public class Main {
    public static void main(String[] args) {
       
        Light livingRoomLight = new Light(70, "Living Room Light");
        Thermostat livingRoomThermostat = new Thermostat(22.5, "Living Room Thermostat");

        Light bedroomLight = new Light(40, "Bedroom Light");
        Thermostat bedroomThermostat = new Thermostat(20.0, "Bedroom Thermostat");

        Room livingRoom = new Room("Living Room", livingRoomLight, livingRoomThermostat);
        Room bedroom = new Room("Bedroom", bedroomLight, bedroomThermostat);

      
        House myHouse = new House(livingRoom, bedroom);

      
        System.out.println("=== All Devices in the House ===");
        myHouse.showAllDevices();

       
        System.out.println("\n=== Controlling All Devices ===");
        myHouse.controlAllDevices();
    }
}
