package topic_1_design_patterns.exercise1;

/**
 * Using Builder
 */
public class Main {
    public static void main(String[] args) {

        Blueprints blueprints = new Blueprints();//Specs or blueprint
        MusicDeviceEngineer musicDeviceEngineer = new MusicDeviceEngineer(blueprints);//Engineer needs blueprints

        musicDeviceEngineer.makeRobot();
        MusicDevice firstRobot = musicDeviceEngineer.getMusicDevice();

        System.out.println(firstRobot.getMusicDeviceStorage());
        System.out.println(firstRobot.getMusicDeviceColor());
        System.out.println(firstRobot.getMusicDeviceBatteryAutonomy());
        
    }
}

