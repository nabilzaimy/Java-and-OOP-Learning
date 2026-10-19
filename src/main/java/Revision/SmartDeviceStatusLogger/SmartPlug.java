package Revision.SmartDeviceStatusLogger;

public class SmartPlug {

    String deviceName;
    double voltage;
    boolean isOn;

    SmartPlug(String deviceName , double voltage , boolean isOn){
        this.deviceName = deviceName;
        this.voltage = voltage;
        this.isOn = isOn;
    }

    @Override
    public String toString(){
        return "[Device: " + deviceName + "  | Voltage: " + voltage + "V  | Status: " + isOn + "]";
    }

}
