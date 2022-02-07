package topic_1_design_patterns.exercise1;

public class MusicDevice implements MusicDevicePlan{

    //Required parts for the device
    private String musicDeviceStorage;
    private String musicDeviceColor;
    private String musicDeviceBatteryAutonomy;


    @Override
    public void setDeviceStorage(String storage) {
        musicDeviceStorage = storage;

    }

    @Override
    public void setDeviceColor(String color) {
        musicDeviceColor = color;
    }

    @Override
    public void setDeviceBatterAutonomy(String batteryAutonomy) {
        musicDeviceBatteryAutonomy = batteryAutonomy;
    }

    public String getMusicDeviceStorage() {
        return musicDeviceStorage;
    }

    public String getMusicDeviceColor() {
        return musicDeviceColor;
    }

    public String getMusicDeviceBatteryAutonomy() {
        return musicDeviceBatteryAutonomy;
    }
}
