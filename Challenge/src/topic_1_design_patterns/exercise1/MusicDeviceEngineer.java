package topic_1_design_patterns.exercise1;

public class MusicDeviceEngineer {

    private Blueprints musicDeviceBuilder;

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
