package topic_1_design_patterns.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Blueprints implements MusicDeviceBuilder{

    //Join parts and how to make them, to create de device
    //Sets specific filed to make specific devices
    //Assemble all the parts
    private MusicDevice musicDevice;
    private String storage;
    private String color;
    private String batteryAutonomy;


    Blueprints(String storage,String color,String batteryAutonomy){
        this.musicDevice = new MusicDevice();
        this.storage = storage;
        this.color = color;
        this.batteryAutonomy = batteryAutonomy;
    }

    @Override
    public void buildMusicDeviceStorage() {
        musicDevice.setDeviceStorage(storage);
    }

    @Override
    public void buildRobotMusicDeviceColor() {
        musicDevice.setDeviceColor(color);

    }

    @Override
    public void buildMusicDeviceBatteryAutonomy() {
        musicDevice.setDeviceBatterAutonomy(batteryAutonomy);

    }


    @Override
    public MusicDevice getMusicDevice() {
        return this.musicDevice;
    }
}
