package topic_1_design_patterns.exercise1;

public class Blueprints implements MusicDeviceBuilder{

    private MusicDevice musicDevice;

    Blueprints(){
        this.musicDevice = new MusicDevice();
    }

    @Override
    public void buildMusicDeviceStorage() {
        musicDevice.setDeviceStorage("8Gb");
    }

    @Override
    public void buildRobotMusicDeviceColor() {
        musicDevice.setDeviceColor("Green");

    }

    @Override
    public void buildMusicDeviceBatteryAutonomy() {
        musicDevice.setDeviceBatterAutonomy("8 hours");

    }


    @Override
    public MusicDevice getMusicDevice() {
        return this.musicDevice;
    }
}
