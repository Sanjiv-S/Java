import java.util.Scanner;

public class smarthome {
    Scanner sc = new Scanner(System.in);

    static final class device {
        Scanner sc = new Scanner(System.in);
        final static int MAX_DEVICES = 50;
        int id;
        String name;

        public void getDeviceInfo() {
            System.out.print("Device ID: ");
            id = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.print("Device Name: ");
            name = sc.nextLine();
        }
    }

    final static class Configuration {
        final static int MAX_POWER_LIMIT = 5000;
    }

    public static abstract class DeviceType {
        abstract String getDeviceCategory();
    }

    public static class lightdevice extends DeviceType {
        public String getDeviceCategory() {
            return "Light device";
        }
    }

    public static class fandevice extends lightdevice {
        public String getDeviceCategory() {
            return "Fan device";
        }
    }

    public static void main(String args[]) {
        device obj = new device();
        obj.getDeviceInfo();

        System.out.println("Max Power Limit: " + Configuration.MAX_POWER_LIMIT);

        DeviceType lightdevice = new lightdevice();
        DeviceType fandevice = new fandevice();

        System.out.println("Light device category: " + lightdevice.getDeviceCategory());
        System.out.println("Fan device category: " + fandevice.getDeviceCategory());
    }
}
