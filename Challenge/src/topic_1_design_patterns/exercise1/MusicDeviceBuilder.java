package topic_1_design_patterns.exercise1;

public interface MusicDeviceBuilder {

    //Required tools for building the device
    //Defined what every device has
    void buildMusicDeviceStorage();
    void buildRobotMusicDeviceColor();
    void buildMusicDeviceBatteryAutonomy();
    MusicDevice getMusicDevice();

}
