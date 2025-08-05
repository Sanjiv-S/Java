public class Room {
    private String roomName;
    private SmartDevice device1;
    private SmartDevice device2;

    public Room(String roomName, SmartDevice device1, SmartDevice device2) {
        this.roomName = roomName;
        this.device1 = device1;
        this.device2 = device2;
    }

    public void showRoomDevices() {
        System.out.println("Room: " + roomName);
        System.out.println("- " + device1.getDeviceName());
        System.out.println("- " + device2.getDeviceName());
    }

    public void controlDevices() {
        System.out.println("Controlling devices in " + roomName);
        device1.performFunction();
        device2.performFunction();
    }
}

