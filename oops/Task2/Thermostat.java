
public class Thermostat extends SmartDevice {
    private double temperature;

    public Thermostat(double temperature, String deviceName) {
        super(deviceName);
        this.temperature = temperature;
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    @Override
    void performFunction() {
        System.out.println("Device Name: " + getDeviceName());
        System.out.println("Temperature Set: " + temperature + "°C");
    }
}
