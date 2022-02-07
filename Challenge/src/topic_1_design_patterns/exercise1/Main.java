package topic_1_design_patterns.exercise1;

import topic_1_design_patterns.exercise3.ExtraBacon;
import topic_1_design_patterns.exercise3.ExtraChips;
import topic_1_design_patterns.exercise3.ExtraPineapple;
import topic_1_design_patterns.exercise3.ExtraSauce;

import java.util.Scanner;

/**
 * Using Builder
 */
public class Main {
    public static void main(String[] args) {

        //Input
        Scanner scanner = new Scanner(System.in);
        String menu = "0";
        String storage="";
        String color="";
        String autonomy="";

        //Using while loop to create a menu for each parameter
        while (!((menu.equals("1"))||(menu.equals("2")))) {
            System.out.println("Customize your music device!");
            System.out.println("Select storage capacity:");
            System.out.println("""
                    1. 8gb
                    2. 16gb
                    """);
            menu = scanner.next();

            switch (menu) {
                case "1" -> storage = "8gb";
                case "2" -> storage = "16gb";
                default -> System.out.println("invalid option...");

            }

        }

        //Reset menu variable
        menu = "";

        while (!((menu.equals("1"))||(menu.equals("2")))) {
            System.out.println("Customize your music device!");
            System.out.println("Select battery autonomy:");
            System.out.println("""
                    1. 5 hours
                    2. 8 hours
                    """);
            menu = scanner.next();

            switch (menu) {
                case "1" -> autonomy = "5 hours";
                case "2" -> autonomy = "8 hours";
                default -> System.out.println("invalid option...");

            }

        }
        menu = "";

        while (!((menu.equals("1"))||(menu.equals("2")))) {
            System.out.println("Customize your music device!");
            System.out.println("Select color of your device:");
            System.out.println("""
                    1. Blue
                    2. Green
                    """);
            menu = scanner.next();

            switch (menu) {
                case "1" -> color = "Blue";
                case "2" -> color = "Green";
                default -> System.out.println("invalid option...");

            }

        }

        //Builder implementation
        Blueprints blueprints = new Blueprints(storage,color,autonomy);//Specs or blueprint
        MusicDeviceEngineer musicDeviceEngineer = new MusicDeviceEngineer(blueprints);//Engineer needs blueprints
        musicDeviceEngineer.makeRobot();
        MusicDevice newMusicDevice = musicDeviceEngineer.getMusicDevice();

        //Output
        System.out.println("\nYour device is featured with:");
        System.out.println("Storage: "+newMusicDevice.getMusicDeviceStorage());
        System.out.println("Color: "+newMusicDevice.getMusicDeviceColor());
        System.out.println("Battery autonomy: "+newMusicDevice.getMusicDeviceBatteryAutonomy());

    }
}

