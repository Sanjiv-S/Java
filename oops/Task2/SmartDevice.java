
abstract class SmartDevice {
    private String deviceName;

    public SmartDevice(String deviceName) {
        this.deviceName=deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }
    abstract void performFunction();
}
