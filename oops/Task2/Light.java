
public class Light extends SmartDevice {
    private int brightnessLevel;
    public Light(int brightnessLevel, String deviceName) {
        super(deviceName);  
        this.brightnessLevel = brightnessLevel;
    }
    void setBrightness(int brightnessLevel){
        this.brightnessLevel=brightnessLevel;
    }

    void performFunction() {
        System.out.println("Device Name:"+getDeviceName());
        System.out.println("Brightness level:"+brightnessLevel);
    }
    
}
