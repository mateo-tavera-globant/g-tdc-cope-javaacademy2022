package topic_1_design_patterns.exercise1;

public class MusicDeviceEngineer {
    //Creates a device with the fields set by the builder
    //Director
    String storage;
    private Blueprints musicDeviceBuilder;//Factory

    public MusicDeviceEngineer(Blueprints musicDeviceBuilder) {
        this.musicDeviceBuilder = musicDeviceBuilder;
    }

    public MusicDevice getMusicDevice(){
        return this.musicDeviceBuilder.getMusicDevice();
    }

    public void makeRobot(){
        this.musicDeviceBuilder.buildMusicDeviceStorage();
        this.musicDeviceBuilder.buildRobotMusicDeviceColor();
        this.musicDeviceBuilder.buildMusicDeviceBatteryAutonomy();
    }
}
